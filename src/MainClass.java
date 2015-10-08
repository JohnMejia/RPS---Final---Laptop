import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args)

	{
		Random myRNG = new Random();
		Scanner myKeyboard = new Scanner(System.in);
		String doAgain;
		int cpuChoice = myRNG.nextInt(3);

		do {

			String myChoice = JOptionPane.showInputDialog(null, "Please enter S for scissors, R for rock, or P for paper: ").toUpperCase();


			while ((!(myChoice.equals("R"))) && (!(myChoice.equals("P"))) && (!(myChoice.equals("S")))) 
			{
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");			
			}
			switch(myChoice.toUpperCase()){


			case "R": 
			{
				switch(cpuChoice) 
				{
				case 0: 
				{
					JOptionPane.showMessageDialog(null, "We both picked rock!\nThe game is a draw.");
					break;

				} 
				case 1: 
				{
					JOptionPane.showMessageDialog(null, "You picked rock.\nI picked paper.\nYou lose!");
					break;

				} 
				case 2: 
				{
					JOptionPane.showMessageDialog(null, "You picked rock.\nI picked scissors.\nYou win!");
					break;
				}

				}
				break;
			} 
			case "P": 
			{
				switch(cpuChoice)
				{
				case 0: 
				{
					JOptionPane.showMessageDialog(null, "You picked paper.\nI picked rock.\nYou win!");
					break;
				} 
				case 1: 
				{
					JOptionPane.showMessageDialog(null, "We both picked paper!\nThe game is a draw.");
					break;
				} 
				case 2: 
				{
					JOptionPane.showMessageDialog(null, "You picked paper.\nI picked scissors.\nYou lose!");
					break;
				}

				}
				break;
			} 
			case "S":
				switch(cpuChoice)
				{
				case 0: 
				{
					JOptionPane.showMessageDialog(null, "You picked scissors.\nI picked rock.\nYou lose!");
					break;
				} 
				case 1: 
				{
					JOptionPane.showMessageDialog(null, "You picked scissors.\nI picked paper.\nYou win!");
					break;
				} 
				case 2: 
				{
					JOptionPane.showMessageDialog(null, "We both picked scissors!\nThe game is a draw.");
					break;
				}

				}
				break;

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