/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author HP
 */
public class Outlook implements IServer {

    private final String host = "office365.com";

    @Override
    public String useServer() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
            return "{}";
        }
    }

    public String getHost() {
        return host;
    }
}
