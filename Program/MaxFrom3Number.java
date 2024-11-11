// Enter 3 nos and display the max from it. by using java.util.Scanner

	
import java.util.Scanner;
class MaxFrom3Number
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		int m1=0,m2=0,m3=0,max=0;
		
		System.out.println("Enter any Three Number : ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();

		max=(m1>m2)?(m1>m3)?m1:m3:(m2>m3)?m2:m3;

		System.out.println("Maximum Number = "+max);
	}

}
