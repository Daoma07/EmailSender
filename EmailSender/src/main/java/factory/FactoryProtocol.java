/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import enums.EnumProtocol;

/**
 *
 * @author HP
 */
import chain.ChainProtocol;
import linkProtocol.LinkProtocol;
import protocol.IProtocol;

public class FactoryProtocol implements IFactoryProtocol {

    ChainProtocol chainProtocol;

    public FactoryProtocol() {

        this.chainProtocol = new LinkProtocol();
    }

    @Override
    public IProtocol useProtocol(EnumProtocol protocol) {
        return chainProtocol.useProtocol(protocol);
    }
}
