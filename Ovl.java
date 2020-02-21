
public class Ovl {
	void display()
	{
		System.out.println("hello");
	}
	void display(int b)
	{
		System.out.println("World");
	}

}
class Exec
{
public static void main(String[] args) {
	Ovl obj1=new Ovl();
	obj1.display(9);
}
}
