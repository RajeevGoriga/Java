import java.util.Scanner;

public class UserMainCode {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a;
		int sum=0;
		while(n>0)
		{
			a=n%10;
			if(a%2!=0)
			{
			sum=sum+a;	
			}
			n=n/10;	
		}
		if (sum%2==0)
		{
			System.out.println("sum of odd digits is even");
		}else
		{
			System.out.println("sum of odd digits is odd");
		}
		
	}

}
