/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainProtocol;

import protocol.Protocol;

/**
 *
 * @author HP
 */
public abstract class ChainProtocol {

    public ChainProtocol nextHandler;

    public void setNextHandler(ChainProtocol nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract Protocol useProtocol();
}
