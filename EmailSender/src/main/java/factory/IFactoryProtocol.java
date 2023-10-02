/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;

/**
 *
 * @author HP
 */
public interface IFactoryProtocol {

    public boolean useProtocol(User user, Email email, EnumProtocol protocol,
            EnumServer server);
}
