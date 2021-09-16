package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("how old are you");
	int ageAsInt = Integer.parseInt(age);
	if (ageAsInt >= 18) {
		JOptionPane.showMessageDialog(null, "who do you think should be president?");
	}
	else {
		JOptionPane.showMessageDialog(null, "https://www.youtube.com/watch?v=RMGsoZubQoI");
	}
}
}
