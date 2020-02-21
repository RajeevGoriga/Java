/*11.  Write a program to generate the following series:

                        1, -2, 3, -4, 5, -6, … N */

class Series
{
public static void main(String[] args)
{
int N=10;int n=-10;
int i=1;int j=-2;
while(i<=N)
{
System.out.println(i);
i+=2;
while(j>=n)
{
System.out.println(j);
j=j-2;
break;
}
}
}
}