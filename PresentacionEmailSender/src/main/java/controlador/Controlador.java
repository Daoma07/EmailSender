/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

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
public class Controlador implements IControlador {

    private IFacade facade;

    public Controlador() {
        this.facade = new Facade();
    }

    @Override
    public boolean sendEmail(User user, Email email, EnumProtocol protocol,
            EnumServer server) {
        return this.facade.sendEmail(user, email, protocol, server);
    }

}
