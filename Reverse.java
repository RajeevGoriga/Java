//9.      Write a program to find the reverse of a number. Store the reverse value in a different variable. Display the reverse.

class Reverse{
public static void main(String[] args){
int rev=0;
int num=123;
int i;
while(num!=0)
{
i=num%10;
rev=rev*10+i;
num=num/10;
}
System.out.println(rev);
}
}