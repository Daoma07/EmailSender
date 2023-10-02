/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocol;

import domain.Email;
import domain.User;
import enums.EnumProtocol;
import enums.EnumServer;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author HP
 */
public class Smtp extends ChainProtocol {

    @Override
    public boolean sendEmail(User user, Email email, EnumProtocol protocol,
            EnumServer server, String port) {
        if (protocol.equals(protocol.SMTP)) {
            host = factoryServer.useServer(server);
            //La direc ción de correo de envío
            String remitente = user.getEmailSender();
            //La clave de aplicación obtenida según se explica en este artículo:
            String claveemail = user.getPassword();

            Properties props = System.getProperties();
            props.put("mail.smtp.host", "smtp." + host);  //El servidor SMTP de Google
            props.put("mail.smtp.user", remitente);
            props.put("mail.smtp.clave", claveemail);    //La clave de la cuenta
            props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
            props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
            props.put("mail.smtp.port", port); //El puerto SMTP seguro de Google

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);

            try {
                message.setFrom(new InternetAddress(remitente));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getEmailReceiver()));   //Se podrían añadir varios de la misma manera
                message.setSubject(email.getSubject());
                message.setText(email.getMessage());
                Transport transport = session.getTransport("smtp");
                transport.connect("smtp." + host, remitente, claveemail);
                transport.sendMessage(message, message.getAllRecipients());
                transport.close();
                return true;
            } catch (MessagingException me) {
                me.printStackTrace();   //Si se produce un error
                return false;
            } catch (Exception e) {
                return false;
            }
        } else {
            super.sendEmail(user, email, protocol, server, port); //To change body of generated methods, choose Tools | Templates.SUP
            return false;
        }
    }

}
