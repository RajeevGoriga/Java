import java.util.Scanner;
public class UserMainCode1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a;
		int sum=0;
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				sum=sum+(a*a);
			}
			n=n/10;
		}
		System.out.println(sum);

	}

}
