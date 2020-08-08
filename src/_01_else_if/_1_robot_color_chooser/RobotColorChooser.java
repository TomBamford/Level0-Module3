
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot("mini");
		rob.setPenColor(0, 0, 0);
		rob.penDown();
		rob.setPenWidth(10);
		rob.setSpeed(100);
		for(int j = 0; j < 4; j++) {
			String input = JOptionPane.showInputDialog("What color would you like the robot to draw with?");

			if(input.equalsIgnoreCase("red")) {
				rob.setPenColor(255,0,0);
			}else if(input.equalsIgnoreCase("blue")) {
				rob.setPenColor(0,0,255);
			} else if(input.equalsIgnoreCase("green")) {
				rob.setPenColor(0,255,0);
			} else {
				rob.setRandomPenColor();
			}
			for(int i=1; i<5; i++) {
				rob.move(50);
				rob.turn(90);
			}
		
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		
		}


	}
}
