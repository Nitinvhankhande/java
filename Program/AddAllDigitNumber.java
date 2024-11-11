// Enter any 3 digit number and display the addition of all 3 digits.


import java.io.InputStreamReader;
import java.io.BufferedReader;

class AddAllDigitNumber
{
	public static void main(String []args)
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);

		int no=0;
		
		System.out.println("Enter any number : ");
		
		try{
			no=Integer.parseInt(br.readLine());
		}
		catch (Exception e){}
		
		long add=0;

		for(;no>0;no=no/10)
		{
			add=add+no%10;
		}
		System.out.println("Addition is "+add);
	}
}