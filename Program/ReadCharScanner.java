import java.util.*;
class ReadCharScanner
{
	public static void main(String []args)  //-----( throws Exception)
	{
		Scanner sc = new Scanner(System.in);						
		char ch;
		System.out.println("Enter any character Value: ");
		ch=sc.nextLine().charAt(0);
		System.out.println("character is: "+ch);
	}
}
