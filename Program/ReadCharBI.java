// Reading character using BufferedReader-InputStreamReader or Scanner


import java.io.*;
class ReadCharBI
{
	public static void main(String []args)throws Exception 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char ch;
		System.out.println("Enter any character");	
		ch=br.readLine().charAt(0);
		System.out.println("Character is : "+ch);
	}
}