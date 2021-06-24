//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	
	
	Random ran = new Random();
	
int number;
	// 2. Get the user to enter a question for the 8 ball to answer
	
    String response =  JOptionPane.showInputDialog("ASK ME ANYTHING");
	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

number = ran.nextInt(4 - 0 +1) +  0;
	
	// 4. If the random number is 0

	// -- tell the user "Yes"
if (number == 0) {
	JOptionPane.showMessageDialog(null,"yes" );
} else if (number == 1) {
	JOptionPane.showMessageDialog(null,"no" );
} else if (number == 2) { JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
	// 5. If the random number is 1
} else if (number == 3) { JOptionPane.showMessageDialog(null,"Youtube has the answers to everything. Try asking it.");
	
}else if (number == 4) { JOptionPane.showMessageDialog(null, "um, do you really want to know the answer?");
	// -- tell the user "No"
}
	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
}