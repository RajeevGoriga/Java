//5.      Write a program to accept a student’s name and three marks. Display the total and average. Display result as First class, Second class, Pass class and Fails.

import java.util.Scanner;
class Student{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String Name=s.nextLine();
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int total=a+b+c;
int avg=total/3;
if((avg>=75)&&(avg<=100))
{
System.out.println("First Class");
}else if((avg>=60)&&(avg<75))
{
System.out.println("Second Class");
}else if((avg>=40)&&(avg<60))
{
System.out.println("Pass");
}else if(avg<40)
{
System.out.println("Fail");
}
}
}
