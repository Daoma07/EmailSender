/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryServer;

/**
 *
 * @author HP
 */
import enums.EnumServer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import server.Server;

public class FactoryServer implements IFactoryServer {

    @Override
    public String useServer(EnumServer server) {
        String serverName = server.name();
        try {
            Class<?> classServer = Class.forName("servers." + serverName);
            Constructor<?> constructor = classServer.getDeclaredConstructor();
            Object instanciaServer = constructor.newInstance();
            if (instanciaServer instanceof Server) {
                //Crear cadena
                Class<?> handlerClass = Class.forName("sendServer.SendServer");
                Constructor<?> handlerConstructor = handlerClass.getDeclaredConstructor(Server.class);
                Object handler = handlerConstructor.newInstance(instanciaServer);
                Method useServerMethod = handlerClass.getMethod("useServer");
                return (String) useServerMethod.invoke(handler);
            } else {
                throw new IllegalArgumentException("La clase " + serverName
                        + " no implementa la interfaz Server.");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Clase de server no encontrada.");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al instanciar la clase de server.");
        }
    }

}
