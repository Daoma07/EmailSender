/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryProtocol;

import enums.EnumProtocol;
import protocol.Protocol;

/**
 *
 * @author HP
 */
public interface IFactoryProtocol {

    public Protocol useProtocol(EnumProtocol protocol);
}
