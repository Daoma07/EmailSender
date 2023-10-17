/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendServer;

/**
 *
 * @author HP
 */
import chainServer.ChainServer;
import server.Server;

public class SendServer extends ChainServer {

    private Server server;

    public SendServer(Server server) {
        this.server = server;
    }

    @Override
    public String useServer() {
        String jsonServer = server.useServer();
        if (nextHandler != null) {
            nextHandler.useServer();
        }

        return jsonServer;
    }

}
