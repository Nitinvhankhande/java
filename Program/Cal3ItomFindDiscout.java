  // WAP to enter price of 3 items and calc the discount. (discount is 7% when amount exceeds 500)by 


import javax.swing.JOptionPane;
class Cal3ItomFindDiscout
{
	
	public static void main(String args[])
	{	
		double i1=0.0,i2=0.0,i3=0.0,tot=0.0,dis=0.0;
		System.out.println("Enter any three itom price ");

		i1=Double.parseDouble(JOptionPane.showInputDialog("Enter  first itom price "));
		i2=Double.parseDouble(JOptionPane.showInputDialog("Enter Second itom price "));
		i3=Double.parseDouble(JOptionPane.showInputDialog("Enter Thired itom price "));
		
		tot=i1+i2+i3;
		if(tot>=500)
		{
			dis=tot*0.07;
		}
		
		System.out.println("Total Bill : "+tot);
		if(tot>=500)
		{
			System.out.println("Discount : "+dis);
		}
		System.out.println("finel Bill : "+(tot-dis));
	}
}
