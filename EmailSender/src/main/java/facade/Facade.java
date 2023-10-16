/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import sendEmail.ISendEmail;
import sendEmail.SendEmail;

/**
 *
 * @author HP
 */
//Facade
public class Facade implements IFacade {

    ISendEmail sendEmailWeb;

    public Facade() {
        sendEmailWeb = new SendEmail();
    }

    @Override
    public boolean sendEmail(User user, Email email, EnumProtocol protocol, EnumServer server) {
        return sendEmailWeb.sendEmail(user, email, protocol, server);
    }

}
