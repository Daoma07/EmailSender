/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import enums.EnumServer;

/**
 *
 * @author HP
 */
public abstract class ChainServer {

    public ChainServer nextChainServer;

    public void setNextServer(ChainServer chainServer) {
        this.nextChainServer = chainServer;
    }

    public abstract String useServer(EnumServer server);
}
