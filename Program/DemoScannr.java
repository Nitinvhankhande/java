import java.util.Scanner;

class DemoScannr
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);

		int x;
		float y;
		double db;
		short s;
			
		System.out.println("Enter the int value : ");
		x=sc.nextInt();
		System.out.println("Enter the Float value : ");
		y=sc.nextFloat();
		System.out.println("Enter the Double Value : ");
		db=sc.nextDouble();
		System.out.println("Enter the short Value : ");
		s=sc.nextShort();

		System.out.println("intger Value : "+x);
		System.out.println("Float Value : "+y);
		System.out.println("Double Value : "+db);
		System.out.println("Short Value : "+s);

	}
}

