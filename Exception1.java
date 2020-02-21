
public class Exception1 {

	public static void main(String[] args) {
		int num=10;
		int a=0;
		int c[]=new int[5];
		try
		{
			c[2]=100;
			System.out.println(c[8]);
			try
			{
			System.out.println(num/a);	
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
			}

}
