package _03_string_conversion._4_voting_booth;

import java.net.URI;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("how old are you");
	int ageAsInt = Integer.parseInt(age);
	if (ageAsInt >= 18) {
		JOptionPane.showMessageDialog(null, "who do you think should be president?");
	}
	else {
playVideo("https://www.youtube.com/watch?v=RMGsoZubQoI");
	}
	
}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
	
}

}
}