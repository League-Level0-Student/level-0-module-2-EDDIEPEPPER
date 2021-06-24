package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
public static void main(String[] args) {
	
	int number;
	int numbr;
		int numbe;
	int numbor;
	int e;
	int r;
	Random ran = new Random();
	 number = ran.nextInt(400 - 1 +1) +  1;
	
	numbr = ran.nextInt(400 - 1 +1) + 1;
	
	e = ran.nextInt(400 - 1 +1) + 1;
	numbor = ran.nextInt(400 - 1 +1) + 1;
	numbe = ran.nextInt(400 - 1 +1) + 1;
	r = ran.nextInt(400 - 1 +1) + 1;
	JOptionPane.showMessageDialog(null, number + " " + e + " " + numbr + " " +numbor + " " + " " +numbe +" "+ r);
}
}
