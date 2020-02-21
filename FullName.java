
public class FullName {

	public static void main(String[] s) {
		try
		{
			int length=s[0].length()+s[1].length();
			if (length<10)
				return;
			System.out.println(" Name should be less than 20 in total");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("2 command line argu required");
		}
		finally
		{
			System.out.println("Thank you!");
		}

	}

}
