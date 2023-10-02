/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import enums.EnumServer;
import server.ChainServer;
import server.Gmail;
import server.ICloud;
import server.Outlook;
import server.Yahoo;

/**
 *
 * @author HP
 */
public class FactoryServer implements IFactoryServer {

    ChainServer gmail;
    ChainServer iCloud;
    ChainServer outlook;
    ChainServer yahoo;

    public FactoryServer() {
        this.gmail = new Gmail();
        this.iCloud = new ICloud();
        this.outlook = new Outlook();
        this.yahoo = new Yahoo();
    }

    @Override
    public String useServer(EnumServer server) {
        gmail.setNextServer(iCloud);
        iCloud.setNextServer(outlook);
        outlook.setNextServer(yahoo);
        return gmail.useServer(server);
    }
}
