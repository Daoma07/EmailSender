/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author HP
 */
public class User {

    public String emailSender;
    public String password;

    public User() {
    }

    public User(String emailSender, String password) {
        this.emailSender = emailSender;
        this.password = password;
    }

    public String getEmailSender() {
        return emailSender;
    }

    public void setEmailSender(String emailSender) {
        this.emailSender = emailSender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "emailSender=" + emailSender + ", password=" + password + '}';
    }

}
