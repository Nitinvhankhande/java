class DemoCmdlnSI2
{
	public static void main(String[]args)
	{
		int p=0,n=0;
		double r=0.0,si=0.0;
		try{

		p=Integer.parseInt(args[0]);
		r=Double.parseDouble(args[1]);
		n=Integer.parseInt(args[2]); 
		}
		catch(Exception e)
		{
			System.out.println("To calculate Simple Interst pass the values as a command line arguments ");
		}

		si=p*r*n/100;
		System.out.println("Simple Interest : "+si);
	}
}