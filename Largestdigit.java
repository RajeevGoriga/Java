import java.util.Scanner;
class Largestdigit{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b&&a>c)
  {
   System.out.println("The First Largest"+a);
 	 if(b>c)
	  {
   	System.out.println("The second Largest"+b);
 	 }
 	 else
  	{
 	 System.out.println("The second Largest"+c);
  	}
}

       else if(b>a&&b>c)
       {
       System.out.println("The First Largest"+b);
  	if(a>c)
 	 {
   	System.out.println("The second Largest"+a);
   	}
  	 else
	  {
  	System.out.println("The second Largest"+c);
  	}
}
else
  {
   System.out.println("The First Largest"+c);
  if(a>b)
   {
System.out.println("The second Largest"+a);
}
else
{
System.out.println("The second Largest"+b);
}
}
}
}
