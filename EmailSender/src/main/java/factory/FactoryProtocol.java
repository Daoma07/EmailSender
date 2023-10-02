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
import port.IUsePort;
import port.UsePort;
import protocol.ChainProtocol;
import protocol.Smtp;

/**
 *
 * @author HP
 */
public class FactoryProtocol implements IFactoryProtocol {

    public IUsePort usePort;
    ChainProtocol smtp;

    public FactoryProtocol() {
        this.usePort = new UsePort();
        this.smtp = new Smtp();
    }

    @Override
    public boolean useProtocol(User user, Email email, EnumProtocol protocol,
            EnumServer server) {
        String port = usePort.readFile(protocol, server);
        return smtp.sendEmail(user, email, protocol, server, port);
    }

}
