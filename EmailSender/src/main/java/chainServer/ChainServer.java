/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainServer;

/**
 *
 * @author HP
 */
public abstract class ChainServer {

    public ChainServer nextHandler;

    public void setNextServer(ChainServer nexnextHandler) {
        this.nextHandler = nexnextHandler;
    }

    public abstract String useServer();
}
