package Utilitario;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Notificacion {

    public String enviarCorreo(String nombreUsuario, String correoDestino, String asunto) {
        try {
            String correo = "montanez.ayala@gmail.com";
            String contra = "xajclsxqsqdbrkqn";
            String cuerpoMensaje = "";
            String mensajeRecuperarPass = "Hola " + nombreUsuario + ",\n"
                    + "\n"
                    + "Se realizado una solicitud para reestablecer su contraseña.\n"
                    + "Para continuar, ingrese al siguiente enlace: http://localhost:8080/AgroBien/CambiarPassword.jsp \n"
                    + "\n"
                    + "Si no fue usted, por favor comuníquese al correo soporte@agrobien.com\n"
                    + "\n"
                    + "Soporte de Servicio AgroBien.";

            String mensajeRecuperarCuenta = "Hola " + nombreUsuario + ",\n"
                    + "\n"
                    + "Se realizado una solicitud para recuperar su cuenta.\n"
                    + "Para continuar, ingrese al siguiente enlace: http://localhost:8080/AgroBien/DesbloquearCuenta.jsp \n"
                    + "\n"
                    + "Si no fue usted, por favor comuníquese al correo soporte@agrobien.com\n"
                    + "\n"
                    + "Soporte de Servicio AgroBien.";

            String mensajeNotificarContacto = "Hola, soy " + nombreUsuario +",\n"
                    + asunto + "";

            if (asunto.equals("Recuperación de contraseña")) {
                cuerpoMensaje = mensajeRecuperarPass;
            } else if (asunto.equals("Recuperación de cuenta")) {
                cuerpoMensaje = mensajeRecuperarCuenta;
            } else {
                cuerpoMensaje = mensajeNotificarContacto;
            }
            
            System.out.println("cuerpoMensaje: " + cuerpoMensaje);
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
            System.out.println("correo: " + correo);
            t.connect(correo, contra);
            //t.connect();
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
        } catch (MessagingException ex) {
            System.out.println("error: " + ex);
            return "ERROR";
        }

        return "";
    }
}
