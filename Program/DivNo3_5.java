// WAP to enter any no check no is divisible  by 3 or 5 or divisible by both or not by both
import java.io.InputStreamReader;
import java.io.BufferedReader;

class DivNo3_5
{
	public static void main(String []args) throws Exception
	{	
		InputStreamReader obj =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(obj);
		int no=0;

		System.out.println("Enter any Number : ");
		no=Integer.parseInt(br.readLine());
		
		if(no%3==0 && no%5==0)
		{
			System.out.println(no+" Number Divided by 3 or 5 both Number");
		}
		else if(no%5==0)
		{
			System.out.println(no+" Number Divided  5 Number");
		}
		else 
		{
			System.out.println(no+" Number Divided  3 Number");
		}	
	}
}