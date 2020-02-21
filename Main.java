
import java.util.*;
public class Main {
public static int addSeriespresent(int n)
{
List<Integer> l=new ArrayList<Integer>();
for(int i=1;i<=n;i++)
if(i%2!=0)
l.add(i);
int n1=l.get(0);
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

public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println(addSeriespresent(n));
}

}

