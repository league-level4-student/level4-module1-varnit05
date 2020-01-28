package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
			case "Sunday":
				System.out.println("your mom");
				break;
				
			case "Monday":
				System.out.println("your dad");
				break;
				
			case "Tuesday":
				System.out.println("your brother");
				break;
				
			case "Wednesday":
				System.out.println("your sister");
				break;
				
			case "Thursday":
				System.out.println("your cousin");
				break;
					
			case "Friday" :
				System.out.println("your aunt");
				break;
					
			case "Saturday":
				System.out.println("your uncle");
				break;
					
		
						
		}
		
		
	}
}
