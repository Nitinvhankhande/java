// Input using GUI created by javax.swing.JOptionPane.showInputDialog()

import javax.swing.JOptionPane;
class InputUsingShowIpDialog
{
	public static void main(String []args)
	{
		int x=0;
		double db=0.0;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter any int value"));
		db=Double.parseDouble(JOptionPane.showInputDialog("Enter any Double value"));

		System.out.println("Integer value : "+x);
		System.out.println("Double Value : "+db);
	}
}
