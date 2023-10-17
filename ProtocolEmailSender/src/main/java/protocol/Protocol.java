/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import domain.Email;
import domain.User;

/**
 *
 * @author HP
 */
public interface Protocol {

    public boolean senEmail(User user, Email email, String jsonServer, String port);
}
