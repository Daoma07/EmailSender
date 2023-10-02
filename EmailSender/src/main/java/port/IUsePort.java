/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package port;

import enums.EnumProtocol;
import enums.EnumServer;

/**
 *
 * @author Daniel Alameda
 */
public interface IUsePort {

    public String readFile(EnumProtocol protocolo, EnumServer servidor);
}
