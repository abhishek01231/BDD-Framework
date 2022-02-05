package support;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import executionEngine.*;
import java.io.IOException;
import java.util.*;
import config.Constants;

public class Emailer {

	
	public void emailsending() {
		
		String host = "192.168.1.15";
		String from = "notifications@healthasyst.com";

		// Adding Receipient
		ArrayList<String> Receipnt = new ArrayList<String>();
		Receipnt.add(Constants.Receipient1);
		Receipnt.add(Constants.Receipient2);
		Receipnt.add(Constants.Receipient3);

		// Adding TESTREPORT FILE
		ArrayList<String> filename = new ArrayList<String>();
		filename.add(Constants.Report1);
		filename.add(Constants.Report2);
		filename.add(Constants.Report3);

		for (int j = 0; j < Receipnt.size(); j++) {
			Properties properties = new Properties();
			properties.put("mail.smtp.auth", "false");
			properties.put("mail.smtp.starttls.enable", "false");
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", "587");
			properties.put("mail.smtp.ssl.trust", host);
			properties.setProperty("mail.user", "notifications@healthasyst.com");
			properties.setProperty("mail.password", "Notifications");
			Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
				
			});
			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(from));
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(Receipnt.get(j)));
				message.setSubject("Directory Attachments");

				BodyPart messageBodyPart = new MimeBodyPart();
				messageBodyPart = new MimeBodyPart();
				Multipart multipart = new MimeMultipart();

				BodyPart messageBodyPart1 = new MimeBodyPart();
				messageBodyPart1 = new MimeBodyPart();
				messageBodyPart1.setText("Hi All,\n"
						+ "\n This email was triggered by Automation tool. Please see the attached report for the today's Sanity test Results. Automation Team is still analyzing these results \n"
						+ "\n Thanks\n" + "\n ATG Team");
				multipart.addBodyPart(messageBodyPart1);

//			
				String Subjectname = "Execution Report OF ";

				for (int k = 0; k < filename.size(); k++) {
					Subjectname += filename.get(k).substring(filename.get(k).lastIndexOf("\\") + 1) + ",";

					
				}
				message.setSubject(Subjectname);
				for (int i = 0; i < filename.size(); i++) {

				
					System.out.println("Adding: " + filename.get(i));
					messageBodyPart = new MimeBodyPart();
					DataSource source = new FileDataSource(filename.get(i));
					messageBodyPart.setDataHandler(new DataHandler(source));
					messageBodyPart.setFileName(filename.get(i).substring(filename.get(i).lastIndexOf("\\") + 1));
					multipart.addBodyPart(messageBodyPart);
				}
				message.setContent(multipart);

				Transport.send(message);
			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}
	}
}