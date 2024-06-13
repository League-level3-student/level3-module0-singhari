package _00_Intro_To_Arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _03_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	Random ran;
	int hiddenNum;
	
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] rnum;
	//2 create an int variable called hiddenButton
	int hiddenButton;
	public static void main(String[] args) {
		new _03_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ran = new Random();
		//3.  Ask the user to enter a positive number and convert it to an int
		String snum = JOptionPane.showInputDialog("Enter a positive number.");
		int num = Integer.valueOf(snum);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		rnum = new JButton[num];
		//5. Make a for loop to iterate through the JButton array
		for(int i = 0; i < num; i++) {
			rnum[i] = new JButton();
			rnum[i].addActionListener(this);
			panel.add(rnum[i]);
		}
		window.add(panel);
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
		
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//11. set the JFrame to visible.
		window.setVisible(true);
		//12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "Rule");
		//13. initialize the hiddenButton variable to a random number less than the int created in step 3
		hiddenNum = ran.nextInt(num);
		//14. Set the text of the JButton located at hiddenButton to  "ME"
		rnum[hiddenNum].setText("ME");
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		rnum[hiddenNum].setText(" ");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(buttonClicked == rnum[hiddenNum]) {
			JOptionPane.showMessageDialog(null, "You win");
		}
		else {
		JOptionPane.showMessageDialog(buttonClicked, "Try again");	
		}
		//18. else tell them to try again
	}
}
