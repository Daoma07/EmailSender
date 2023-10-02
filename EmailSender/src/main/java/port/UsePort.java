/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package port;

import enums.EnumProtocol;
import enums.EnumServer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 *
 * @author Daniel Alameda
 */
public class UsePort implements IUsePort {

    public String readFile(EnumProtocol protocolo, EnumServer servidor) {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("port/server.txt");

        if (inputStream != null) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
                String linea = br.readLine();

                while (linea != null) {
                    if (linea.contains(protocolo.toString()) && linea.contains(servidor.toString())) {
                        int st = linea.indexOf(",") + 1;
                        int end = linea.length();
                        return linea.substring(st, end);
                    } else {
                        linea = br.readLine();
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            System.err.println("No se pudo encontrar el archivo de recursos.");
        }
        return null;

    }
}
