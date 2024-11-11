    // Write as program to interchange the values of 2 variables


class InterchangValue2Variable
{
	public static void main(String []args)
 	{
		int A=0,B=0;

		A=Integer.parseInt(args[0]);
		B=Integer.parseInt(args[1]);

		System.out.println("Before Interchang \n\t A="+A+"\tB="+B);
		
			A=A+B;
			B=A-B;
			A=A-B;
		System.out.println("After Interchang \n\t A="+A+"\tB="+B);
	}
}