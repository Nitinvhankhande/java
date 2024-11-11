//Write a C program to input week number and print week day.


import java.util.Scanner;

class InputWeekNoPrintDay
{
	public static void main(String []args)
	{
		int no=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("choose then number between 1-7 number");

		no=sc.nextInt();

		if(no==1)
		    	System.out.println("Monday");
		else if(no==2)
		    	System.out.println("Tuesday");
		else if(no==3)
		    	System.out.println("wednesday");
		else if(no==4)
		    	System.out.println("thursday");
		else if(no==5)
		    	System.out.println("Friday");
		else if(no==6)
		    	System.out.println("Saturday");
		else if(no==7)
		    	System.out.println("Sunday");
		else
		    	System.out.println("Wrong Number !!!!!!!!!!!");

	}
}
