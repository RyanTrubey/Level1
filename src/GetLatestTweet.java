import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Search twitter");
	JTextField text = new JTextField(15);
	JTextPane textpane = new JTextPane();
	JPanel panel2 = new JPanel();
	
	public static void main(String[] args) {
		GetLatestTweet thing = new GetLatestTweet();
		thing.createTweetRetriever();
	}

	void createTweetRetriever() {
		panel.add(text);
		panel.add(button);
		frame.show();
		button.addActionListener(this);
		panel2.add(textpane);
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.SOUTH);
		textpane.setPreferredSize(new Dimension(500, 500));
		textpane.setBackground(new Color(150, 150, 150));
		frame.pack();
	}

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			String s = "";
			for(int i = 0; i < 10; i++) {
				s += result.getTweets().get(i).getText();
				System.out.println();
			}
			return s;
			
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "I have no idea what that is";
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String search = text.getText();
			System.out.println(getLatestTweet(search));
			textpane.setText(getLatestTweet(search));
		}
	}
}
