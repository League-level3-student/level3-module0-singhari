package _00_Intro_To_Arrays;

import java.util.Random;
import java.lang.*;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
    public static void main(String[] args) {
        // 2. create an array of 5 robots.
    	Robot[] robs = new Robot[5];
    	boolean someoneWon= false;
        // 3. use a for loop to initialize the robots.
    	for(int i = 0; i < robs.length; i++) {
    		robs[i] = new Robot();
    		robs[i].setY(530);
    		robs[i].setX(70+(100*i));
    	}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
    	Random ran = new Random();
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    	while(!someoneWon) {
    for(int i =0; i < robs.length; i++) {
    	robs[i].setY(robs[i].getY()-ran.nextInt(50));
    	if(robs[i].getY() < 20) {
    		someoneWon = true;
    		System.out.println("Robot " + (i+1)+ " is the winner!");
    		i = robs.length;
    	}
    }
    	}
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
    	
    }
}
