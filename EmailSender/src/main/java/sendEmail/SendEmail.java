/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendEmail;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import factory.FactoryProtocol;
import factory.FactoryServer;
import factory.IFactoryProtocol;
import factory.IFactoryServer;
import port.IUsePort;
import port.UsePort;
import protocol.IProtocol;

/**
 *
 * @author HP
 */
public class SendEmail implements ISendEmail {

    IUsePort usePort;
    IFactoryServer factoryServer;
    IFactoryProtocol factoryProtocol;

    public SendEmail() {
        this.usePort = new UsePort();
        this.factoryServer = new FactoryServer();
        this.factoryProtocol = new FactoryProtocol();

    }

    @Override
    public boolean sendEmail(User user, Email email, EnumProtocol protocol, EnumServer server) {
        String host = usePort.readFile(protocol, server);
        String jsonServer = factoryServer.useServer(server);

        return factoryProtocol.useProtocol(protocol).senEmail(user, email, jsonServer, host);

    }
}
