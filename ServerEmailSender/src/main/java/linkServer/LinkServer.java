/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkServer;

import chain.ChainServer;
import enums.EnumServer;
import server.Gmail;
import server.ICloud;

import server.IServer;
import server.Outlook;
import server.Yahoo;

/**
 *
 * @author HP
 */
public class LinkServer extends chain.ChainServer {

    IServer typeServer;

    @Override
    public String useServer(EnumServer server) {
        if (server.equals(server.GMAIL)) {
            typeServer = new Gmail();
        } else if (server.equals(server.ICLOUD)) {
            typeServer = new ICloud();
        } else if (server.equals(server.OUTLOOK)) {
            typeServer = new Outlook();
        } else if (server.equals(server.YAHOO)) {
            typeServer = new Yahoo();
        }

        if (nextChainServer != null) {
            nextChainServer.useServer(server);
        }

        return typeServer.useServer();

    }

    @Override
    public void setNextServer(ChainServer chainServer) {
        super.setNextServer(chainServer);
    }

}
