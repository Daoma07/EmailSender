/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkProtocol;

import enums.EnumProtocol;
import protocol.IProtocol;
import protocol.SMTP;
import chain.ChainProtocol;

/**
 *
 * @author HP
 */
public class LinkProtocol extends ChainProtocol {

    IProtocol typeProtocol;

    @Override
    public IProtocol useProtocol(EnumProtocol protocol) {
        if (protocol.equals(protocol.SMTP)) {
            typeProtocol = new SMTP();
        }

        return typeProtocol;
    }

}
