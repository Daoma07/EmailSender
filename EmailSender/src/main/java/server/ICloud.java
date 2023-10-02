/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import enums.EnumServer;

/**
 *
 * @author HP
 */
public class ICloud extends ChainServer {

    @Override
    public String useServer(EnumServer server) {
        if (server.equals(server.ICLOUD)) {
            return "mail.me.com";
        } else {
            return super.useServer(server);
        }

    }
}
