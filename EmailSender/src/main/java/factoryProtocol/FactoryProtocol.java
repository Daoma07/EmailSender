/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryProtocol;

import enums.EnumProtocol;

/**
 *
 * @author HP
 */
import protocol.Protocol;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class FactoryProtocol implements IFactoryProtocol {

    public FactoryProtocol() {

    }

    @Override
    public Protocol useProtocol(EnumProtocol protocol) {
        //  return chainProtocol.useProtocol(protocol);
        String protocolName = protocol.name();

        try {
            Class<?> classProtocol = Class.forName("protocols." + protocolName);
            Constructor<?> constructor = classProtocol.getDeclaredConstructor();
            Object instanciaProtocol = constructor.newInstance();
            if (instanciaProtocol instanceof Protocol) {
                //Crear cadena
                Class<?> handlerClass = Class.forName("sendProtocol.SendProtocol");
                Constructor<?> handlerConstructor = handlerClass.getDeclaredConstructor(Protocol.class);
                Object handler = handlerConstructor.newInstance(instanciaProtocol);
                Method useProtocolMethod = handlerClass.getMethod("useProtocol");
                return (Protocol) useProtocolMethod.invoke(handler);
            } else {
                throw new IllegalArgumentException("La clase " + protocolName
                        + " no implementa la interfaz Protocol.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Clase de protocolo no encontrada.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al instanciar la clase de protocolo.");
        }

    }

}
