// wap to enter second to keyboard and convert ionto hourse,minute,and second.


import java.io.InputStreamReader;
import java.io.BufferedReader;

class ConvertTimeHrMinSec
{
	public static void main(String []args) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int sec=0,min=0,hr=0;

		System.out.println("Enter the second count ");	
		sec=Integer.parseInt(br.readLine());
	
		hr=sec/3600;
		sec=sec%3600;
		min=sec/60;
		sec=sec%60;

		System.out.println("Time : "+hr+"hr"+min+"min"+sec+"sec");
	}
}
