 // Enter any character and find it is ucase, lcase, digit or special symbol by using java.util.Scanner


import java.util.Scanner;
class FindUcaseLcaseDigitSSymbol
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		
		System.out.println("Enter Any Value from Keyboard ");
		ch=sc.nextLine().charAt(0);
	
		if(ch>=65 && ch<=90)
			System.out.println(ch+" is Uppercase Character");
		else if(ch>=97 && ch<=122)
			System.out.println(ch+" is lowercase Character");
		else if(ch>=48 && ch<=57)
			System.out.println(ch+" is Digit");
		else
			System.out.println(ch+" Special Sysmobl");	
	}
}
