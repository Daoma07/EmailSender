/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author HP
 */
import chain.ChainServer;
import enums.EnumServer;
import linkServer.LinkServer;

public class FactoryServer implements IFactoryServer {

    ChainServer chainServer;

    public FactoryServer() {

        this.chainServer = new LinkServer();
    }

    @Override
    public String useServer(EnumServer server) {
        return chainServer.useServer(server);
    }

}
