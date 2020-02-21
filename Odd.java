//8.      Write a program to find the sum of all odd numbers from 1 to N. Accept N. Display the sum.

import java.util.Scanner;
class Odd{
public static void main(String[] args){
int sum=0;
int n=10;
for(int i=1;i<n;i=i+2)
{
sum=sum+i;
System.out.println(i);
}
System.out.println(sum);
}
}