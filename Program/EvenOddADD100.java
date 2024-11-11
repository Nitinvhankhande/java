//WAp to enter any no check if it even or odd .if no is even then add 100 in it otherwise multiplyd by 10

import java.io.InputStreamReader;
import java.io.BufferedReader;

class EvenOddADD100
{
	public static void main(String []args)
	{
		 int no=0;
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try
		{
			System.out.println("Enter any Number");
			no=Integer.parseInt(br.readLine());

			if(no%2==0)
			{
				System.out.println(no+"  is even  Number ");
				System.out.println("so Add 100 = "+(no+100));
			}
			else
			{
				System.out.println(no+"  is odd  Number ");
				System.out.println("so MUl. by 10 = "+(no*10));
			}
		}
		catch(Exception e){}
	}
}