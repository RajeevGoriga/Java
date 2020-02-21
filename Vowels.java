//7.      Write a program to accept an alphabet and display whether its a vowel or consonant

import java.util.Scanner;
class Vowels{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char a=s.next().charAt(0);
if(a=='A'||a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u')
{
System.out.println("vowels");
}
else
{
System.out.println("consonants");
}
}
}