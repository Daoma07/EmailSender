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
public class Yahoo extends ChainServer {

    public String useServer(EnumServer server) {
        if (server.equals(server.YAHOO)) {
            return "mail.yahoo.com";
        }
        return null;
    }
}
