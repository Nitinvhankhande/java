import java.io.InputStreamReader;
import java.io.BufferedReader;
class IOUsingISRBR
{
	public static void main(String []args)
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		int x=0;
		float y=0.0f;
		double db=0.0;
		x=Integer.parseInt(br.readLine());
		y=Float.parseFloat(br.readLine());
		db=Double.parseDouble(br.readLine());
		
		System.out.println("Intger : "+x+"\tFloat : "+y+"\tDouble : "+db);
	}
}