import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		System.out.println("name of the student:");
		System.out.println("enter the no of subjects:");
		int a[]=new int[5];
		int tot=0;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter the no of subject"+(i+1)+".");
			a[i]=s.nextInt();
			tot=tot+a[i];
		}
		System.out.println("Student Name\t"+name);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Marks in sub"+(i+1)+"are\t;"+a[i]);
		}
		System.out.println("Total\t;"+tot);

	}

}
