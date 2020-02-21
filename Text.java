class Student1
{
	String name;
		Student1(String s)
		{
	
		}
void setName(String mary)
{
	name=mary;
}
String getName()
{
	return name;
}
}
public class Text {
	public static void change(Student1 p) {
		p.setName("mary");
	}

public static void main(String[] args) {
	Student1 s1=new Student1("john");
	change(s1);
	System.out.println("s1="+s1.getName());
	
}
}
