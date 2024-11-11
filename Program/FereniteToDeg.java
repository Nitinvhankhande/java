    // WAP to convert the temp from F to Deg. formula[ (°F − 32) / 1.8 = °C]


import java.io.InputStreamReader;
import java.io.BufferedReader;
class FereniteToDeg
{
	
	public static void main(String args[]) throws Exception
	{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		float ferenite=0.0f,celcius=0.0f;

		System.out.println("Enter the ferenite value ");
		ferenite=Float.parseFloat(br.readLine());

		celcius=(ferenite-32)/1.8f;
		
		System.out.println("Celcius : "+celcius);
	}
}