import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(addSeriespresent(n));
		}
	public static int addSeriespresent(int n)    //n=10
	{
	List<Integer> l=new ArrayList<Integer>();   //[] 
	for(int i=1;i<=n;i++)
	if(i%2!=0)
	l.add(i);                    //[1 3 5 7 9]                
	int n1=l.get(0);              //1,4,-1,6,-3               
	for(int j=1;j<l.size();j++)
	if(j%2!=0)
	{
	n1=n1+l.get(j);
	}
	else
	{
	n1=n1-l.get(j);
	}
	return n1;

	}
	}

