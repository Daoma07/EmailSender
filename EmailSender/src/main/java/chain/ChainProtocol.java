/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

import enums.EnumProtocol;
import protocol.IProtocol;

/**
 *
 * @author HP
 */
public abstract class ChainProtocol {

    public ChainProtocol nextChainProtocol;

    public void setNextProtocol(ChainProtocol chainProtocol) {
        this.nextChainProtocol = chainProtocol;
    }

    public abstract IProtocol useProtocol(EnumProtocol protocol);
}
