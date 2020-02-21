class emp
{
	int eno=101;
	void display() {
		System.out.println(eno);
	}
}
class manager extends emp
{
	void display()
	{
		System.out.println("manager class");
	}
}
public class Text3 {
	public static void main(String[] args)
	{
		manager a=new manager();
		a.display();
	}

}
