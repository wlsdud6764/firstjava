package kr.sam.dev.martin;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	public static void main(String[] args) {
		String[] send = new String[5];
		Scanner sc = new Scanner(System.in);
		String host = "smtp.naver.com";
		System.out.println("아이디를 입력하세요");
		final String user = sc.nextLine();

		System.out.println("비밀번호를 입력하세요");
		final String password = sc.nextLine();

		
		System.out.println( "수신자 메일을 입력하세요");
		 to[5] = sc.nextLine();
//		i++;
//		
//		int i = 0;
//		while (i < 4) {
//			System.out.println(i + "번째" + "수신자 메일을 입력하세요");
//			i++;
//			to = sc.nextLine();
//		}

		// Get the session object
		Properties props = new Properties();

		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// Compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Subject
			message.setSubject("[Subject] Java Mail Test");

			// Text
			message.setText("Simple mail test..");

			// send the message
			Transport.send(message);
			System.out.println("message sent successfully...");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}