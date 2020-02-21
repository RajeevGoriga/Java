import java.util.Scanner;
public class Evaluator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int rev=0;
			while(arr[i]>0)
			{
				int rem=arr[i]%10;
				rev=rev*10+rem;
				arr[i]=arr[i]/10;
				
			}
			System.out.println(rev);
		}
		
		


	}
}
