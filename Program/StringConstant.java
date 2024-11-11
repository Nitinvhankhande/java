
// using string as a case constant

import javax.swing.JOptionPane;
class StringConstant
{
	public static void main(String []args)
	{
		while(true)
		{
			String day=JOptionPane.showInputDialog("Enter name of any weekday and for stop enter exit ");
			switch(day)
			{
				case "Monday":
					System.out.println("Start of work week");
					break;
				case "Tuesday":
				case "Wednesday":
				case "Thursday":
					System.out.println("Midweek");
					break;
				case "Friday":
					System.out.println("End of work week");
					break;
				case "Saturday":
				case "Sunday":
					System.out.println("Weekend");
					break;
				case "exit":
				case "Exit":
				case "EXIT":
					return;
				default:
					System.out.println("Invalid day of the week: "+day);

			}
		}
	}
}