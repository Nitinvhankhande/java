//Write a C program to enter marks of five subjects and calculate total, average and  percentage.


import java.io.InputStreamReader;
import java.io.BufferedReader;

class FiveSubCalTotPer
{
	public static void main(String []args)
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Double s1=0.0,s2=0.0,s3=0.0,s4=0.0,s5=0.30,tot=0.0,per=0.0;
	
		System.out.println("Enter 5 subject marks ");
		try {
			s1=Double.parseDouble(br.readLine());
			s2=Double.parseDouble(br.readLine());
			s3=Double.parseDouble(br.readLine());
			s4=Double.parseDouble(br.readLine());
			s5=Double.parseDouble(br.readLine());

		}
		catch(Exception e){}

		tot=s1+s2+s3+s4+s5;
		per=(s1+s2+s3+s4+s5)/5;
		System.out.println("Total : "+tot);
		System.out.println("Percentage : "+per+"%");
	}	
}

