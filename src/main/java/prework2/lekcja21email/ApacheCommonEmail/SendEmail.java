package prework2.lekcja21email.ApacheCommonEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
    //wysyłak maili za pomoc

    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("TWOJA_NAZWA", "TWOJE_HASLO"));
        email.setSSLOnConnect(true);
        email.setFrom("TWOJA_NAZWA@interia.pl");
        email.setSubject("Siemaa");
        email.setMsg("Witam, robię super kurs programowania!");
        email.addTo("ADRES_EMAIL_GDZIE_WYSLAC");
        System.out.println("Rozpoczęto wysyłanie wiadomości email");
        email.send();
        System.out.println("Wiadomość wysłana");
    }

    //To co należy uzupełnić w powyższym kodzie to w metodzie setAuthentication() przekazujemy swoją nazwę użytkownika
    // i hasło do skrzynki na interii. Podmieniamy też to co znajduje się w metodzie setFrom() na adres email skrzynki
    // na interii oraz w metodzie addTo() wpisujemy adres email np. jakiejś skrzynki, z której normalnie na co dzień korzystamy.
    // Możesz też dostosować temat wiadomości oraz samą wiadomość, albo możesz np. te dane wczytać przy pomocy Scannera od użytkownika.
}
