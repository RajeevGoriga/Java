class Student2
{
	String name;
		Student2(String s)
		{
	name=s;
		}

String getName()
{
	return name;
}
}
public class Text1 {
	public static void main(String[] args) 
	{
		Student2 s1[]=new Student2[2];
		s1[0]=new Student2("mary");
		s1[1]=new Student2("john");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println("Name:"+s1[i].getName());
		}
	}
}

