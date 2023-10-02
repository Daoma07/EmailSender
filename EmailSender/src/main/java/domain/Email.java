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
public class Email {

    public String emailReceiver;
    public String subject;
    public String message;

    public Email() {
    }

    public Email(String emailReceiver, String subject, String message) {
        this.emailReceiver = emailReceiver;
        this.subject = subject;
        this.message = message;
    }

    public String getEmailReceiver() {
        return emailReceiver;
    }

    public void setEmailReceiver(String emailReceiver) {
        this.emailReceiver = emailReceiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Email{" + "emailReceiver=" + emailReceiver + ", subject=" + subject + ", message=" + message + '}';
    }

}
