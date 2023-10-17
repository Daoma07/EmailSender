/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocols;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Email;
import domain.User;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import protocol.Protocol;

/**
 *
 * @author HP
 */
public class SMTP implements Protocol {

    @Override
    public boolean senEmail(User user, Email email, String jsonServer, String port) {
        ObjectMapper objectMapper = new ObjectMapper();
        String host = null;
        try {
            JsonNode jsonNode = objectMapper.readTree(jsonServer);
            host = jsonNode.get("host").asText();

            //The shipping email address
            String remitente = user.getEmailSender();
            //The application key obtained as explained in this article:
            String claveemail = user.getPassword();

            Properties props = System.getProperties();
            props.put("mail.smtp.host", "smtp." + host);
            props.put("mail.smtp.user", remitente);
            props.put("mail.smtp.clave", claveemail);
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.port", port);

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);

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
            me.printStackTrace();
            return false;
        } catch (Exception e) {
            return false;
        }
    }

}
