class AretmaticOperator
{
	public static void main(String []args)
	{
		int x=-13,y=5,z=-2;
		System.out.println("-%+ : "+(x%y));
		System.out.println("-%- : "+(x%z));
		System.out.println("+%- : "+(21%z));
		System.out.println("+%+ : "+(33%4));
		System.out.println("+%+ : "+(33.5%4));
		System.out.println("+%+ : "+(36.5%2.3));
	}
}