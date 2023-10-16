/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import enums.EnumProtocol;
import protocol.IProtocol;

/**
 *
 * @author HP
 */
public interface IFactoryProtocol {

    public IProtocol useProtocol(EnumProtocol protocol);
}
