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
public abstract class ChainServer {

    ChainServer chainServer;

    public void setNextServer(ChainServer chainServer) {
        this.chainServer = chainServer;
    }

    public String useServer(EnumServer server) {

        return this.chainServer.useServer(server);

    }

}
