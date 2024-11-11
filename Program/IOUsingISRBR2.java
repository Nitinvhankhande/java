import java.io.InputStreamReader;
import java.io.BufferedReader;

class IOUsingISRBR2
{
	public static void main(String []args) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int x=0;
		float y=0.0f;
		double db=0.0;

		System.out.println("Enter 1 int value 2.float value 3.double value");
		
		x=Integer.parseInt(br.readLine());
		y=Float.parseFloat(br.readLine());
		db=Double.parseDouble(br.readLine());

		System.out.println("Int : "+x+"\tFloat : "+y+"\t Double : "+db);
	}
}