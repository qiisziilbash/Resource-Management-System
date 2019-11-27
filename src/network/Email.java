/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package network;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
	public Email() {
	}
	
	private int ID;
	
	private String content;
	
	private String address;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setContent(String value) {
		this.content = value;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}

	public Email(businesslogic.utility.Notification notification, String address) {
		this.content = notification.getContent();
		this.address = address;
	}

	public Email(String content, String address) {
		this.content = content;
		this.address = address;
	}

	public void send() throws MessagingException {
		String username = "resourcemanagementproject@gmail.com";
		String password = "resresres";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		String subject = "Notification from resource management system";

		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(getAddress()));
		msg.setSubject(subject);
		msg.setText(getContent());

		// Send the message.
		Transport.send(msg);
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
