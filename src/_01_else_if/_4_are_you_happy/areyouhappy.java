package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
	 public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Are you happy?");
		if (input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
		}
		else if (input.equalsIgnoreCase("no")) {
			input = JOptionPane.showInputDialog("Do you want to be happy?");
			if (input.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something");
			}
			else if (input.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
			}
		} 
			
		
	}
}

	 
