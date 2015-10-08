import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args)

	{
		Random myRNG = new Random();
		Scanner myKeyboard = new Scanner(System.in);
		String doAgain;
		
		do {
			
			String myChoice = JOptionPane.showInputDialog(null, "Please enter S for scissors, R for rock, or P for paper: ").toUpperCase();


			if ((!(myChoice.equals("R"))) && (!(myChoice.equals("P"))) && (!(myChoice.equals("S")))) 
			{
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");			
			}
			else{

				int cpuChoice = myRNG.nextInt(3);
				if (myChoice.equals("R")) 
				{

					if (cpuChoice == 0) 
					{
						JOptionPane.showMessageDialog(null, "We both picked rock!\nThe game is a draw.");

					} 
					else if (cpuChoice == 1) 
					{
						JOptionPane.showMessageDialog(null, "You picked rock.\nI picked paper.\nYou lose!");

					} 
					else if (cpuChoice == 2) 
					{
						JOptionPane.showMessageDialog(null, "You picked rock.\nI picked scissors.\nYou win!");
					}
				} 
				else if (myChoice.equals("P")) 
				{
					if (cpuChoice == 0) 
					{
						JOptionPane.showMessageDialog(null, "You picked paper.\nI picked rock.\nYou win!");
					} 
					else if (cpuChoice == 1) 
					{
						JOptionPane.showMessageDialog(null, "We both picked paper!\nThe game is a draw.");
					} 
					else if (cpuChoice == 2)
					{
						JOptionPane.showMessageDialog(null, "You picked paper.\nI picked scissors.\nYou lose!");
					}
				} 
				else if (myChoice.equals("S")) 
				{
					if (cpuChoice == 0) 
					{
						JOptionPane.showMessageDialog(null, "You picked scissors.\nI picked rock.\nYou lose!");
					} 
					else if (cpuChoice == 1) 
					{
						JOptionPane.showMessageDialog(null, "You picked scissors.\nI picked paper.\nYou win!");
					} 
					else if (cpuChoice == 2) 
					{
						JOptionPane.showMessageDialog(null, "We both picked scissors!\nThe game is a draw.");
					}
				}

			}
			
			doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();
			while(!(doAgain.matches("[YN]+"))) 
			{				
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");
				doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();
				
			}
			
		} while (!(doAgain.equals("N")));
		JOptionPane.showMessageDialog(null,"GoodBye!");
	}
}