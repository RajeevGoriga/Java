import java.util.*;
public class UserMainCode2 {
static String getMiddleCharspresent(String str)
{
	StringBuffer sb=new StringBuffer();
	if(str.length()%2==0)
	{
	 int min=(str.length()/2)-1;
	 int max=(str.length()/2)+1;
		
	}
	int min=0;
	int max=0;
	return str.substring(min,max);
	
	
}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		getMiddleCharspresent(str);
		    
	}
}