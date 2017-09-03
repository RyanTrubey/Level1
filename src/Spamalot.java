import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Spamalot implements ActionListener{
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JTextField text = new JTextField(20);
	JButton Bad = new JButton("BAD");
	JButton Good = new JButton("GOOD");
	static final String FAKE_USERNAME = "thisisanemail385@gmail.com";
	static final String FAKE_PASSWORD = "SoupIsSpam";
	public static void main(String[] args) {
		Spamalot Spam = new Spamalot();
	}

	Spamalot() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(text);
		panel.add(Bad);
		panel.add(Good);
		text.setText("Email");
		frame.pack();
		Good.addActionListener(this);
		Bad.addActionListener(this);
	}
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
