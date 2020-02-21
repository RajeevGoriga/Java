//1.      Write a program to accept a double value. Separate the whole value from the fractional value and store them in two variables. Display the same.

public class Decimal
{
public static void main(String[] args)
{
double d=25.5656;
double a=(int)d;
System.out.println("D:" + d);
System.out.println("Integer Part:" + a);
System.out.println("Decimal Part:" + (d - a));
}
}