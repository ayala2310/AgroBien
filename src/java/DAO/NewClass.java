package DAO;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class NewClass {

    public static void main(String[] args) {
        try {
             String correo = "montanez.ayala@gmail.com";
             String contra = "xajclsxqsqdbrkqn";
             String correoDestino = "miriancastaxeda.2014@gmail.com";
             String asunto = "Recuperar contraseña";
             String cuerpoMensaje = "Hola usuario,\n" +
"\n" +
"Se realizado una solicitud para reestablecer su contraseña.\n" +
"Para continuar, ingrese al siguiente enlace: http://localhost:8080/AgroBien/Login.jsp \n" +
"\n" +
"Si no fue usted, por favor comuníquese al correo soporte@agrobien.com\n" +
"\n" +
"Soporte de Servicio AgroBien.";
             
            Properties p = new Properties();
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.setProperty("mail.smtp.starttls.enable", "true");
            p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            p.setProperty("mail.smtp.port", "587");
            p.setProperty("mail.smtp.user", correo);
            p.setProperty("mail.smtp.auth", "true");

            Session s = Session.getDefaultInstance(p);
            
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            mensaje.setSubject(asunto);
            mensaje.setText(cuerpoMensaje);
            // Envia el mensaje
            Transport t = s.getTransport("smtp");
            t.connect(correo, contra);
            //t.connect();
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
        } catch (MessagingException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
