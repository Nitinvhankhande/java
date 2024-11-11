// casting example

import java.io.InputStreamReader;
import java.io.BufferedReader;
class Typecast
{
	public static void main(String []args) throws Exception
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int x=0,y=0;
		float z=0.0f;
		
		System.out.println("Enter the vlaue of x and y : ");
		
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		
		z=(float)x/y;
		System.out.println("Z="+z);

	}
}