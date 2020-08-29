package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class adventure {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("You are about to embark upon a journey, are you sure you want to continue?");
		if(input.equalsIgnoreCase("yes")) {
			String input1 = JOptionPane.showInputDialog("Do you want to travel on water or on land?");
			if(input1.equalsIgnoreCase("water")) {
				String input2 = JOptionPane.showInputDialog("You have been granted permission to sail on a boat that will take 10 days to reach your final destination. Do you wish to contine?");
				if(input2.equalsIgnoreCase("Yes")) {
					JOptionPane.showMessageDialog(null, "The boat hit an iceberg and sunk on the fourth day of sailing, you made the wrong decision and died. Goodluck in the afterlife.");
				}
				else if (input2.equalsIgnoreCase("No")) {
					JOptionPane.showMessageDialog(null, "Congratulations, you made the correct decision, if you went on the boat you would have died. You have finished the game.");
				}
			}
			else if(input1.equalsIgnoreCase("land")) {
				JOptionPane.showMessageDialog(null, "Congratulations, you made the correct decision, if you went on the boat you would have died. You have finished the game.");
			}
		}
		else if(input.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Goodbye then");
		}
	}
	
}
