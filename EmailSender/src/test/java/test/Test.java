/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import facade.Facade;
import facade.IFacade;

/**
 *
 * @author HP
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        IFacade facade = new Facade();
        System.out.println(facade.sendEmail(new User("daoma222@gmail.com", "rfva uvsn fpzi ubjc"),
                new Email("daniel.alameda228343@potros.itson.edu.mx", "pruebas", "hola"), EnumProtocol.SMTP, EnumServer.GMAIL));

//        System.out.println(facade.sendEmail(new User("danil.lopez.044@hotmail.com", "daniel2002"),
//                new Email("daoma222@gmail.com", "pruebas", "Hola a todos"), EnumProtocol.SMTP, EnumServer.OUTLOOK));

//  
    }

}
