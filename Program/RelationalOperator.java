class RelationalOperator
{
	public static void main(String []args)
	{
		int x=23,y=5;
		boolean b;
		System.out.println("\n x is: "+x+"\t y is: "+y);
		
		b=x!=y;
		System.out.println("(x!=y) is: "+b);

		b=y<1;
		System.out.println("(y<1) is: "+b);

		b=x>y;
		System.out.println("(x>y) is: "+b);

		b=x%10==0;
		System.out.println("(x%10==0) is: "+b);

		b=100%10==0;
		System.out.println("(100%10==0) is: "+b);
		
	}
}