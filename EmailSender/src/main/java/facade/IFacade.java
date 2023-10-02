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

/**
 *
 * @author HP
 */
public interface IFacade {

    public boolean sendEmial(User user, Email email, EnumProtocol protocol,
            EnumServer server);

}
