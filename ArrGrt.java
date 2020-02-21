

import java.util.Scanner;
public class ArrGrt {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=1;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int gr=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>gr)
			{
				gr=arr[i];
			}
		}
		System.out.println(gr);
	}

}
