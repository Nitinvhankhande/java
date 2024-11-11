import javax.swing.JOptionPane;


class TableAnyNo
{
	public static void main(String []args)
	{
		int no=0;
		no=Integer.parseInt(JOptionPane.showInputDialog("Enter any Number"));
		
		System.out.println(no+" Table \n");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*no);
		}
	}
}
