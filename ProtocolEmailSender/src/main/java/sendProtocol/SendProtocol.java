/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendProtocol;

import chainProtocol.ChainProtocol;
import protocol.Protocol;

/**
 *
 * @author HP
 */
public class SendProtocol extends ChainProtocol {

    private Protocol protocol;

    public SendProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    @Override
    public Protocol useProtocol() {
        if (nextHandler != null) {
            nextHandler.useProtocol();
        }
        return protocol;
    }

}
