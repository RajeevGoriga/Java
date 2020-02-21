class A1
{
	int x=1000;
	A1()
	{
		System.out.println("A1");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1");
	}
}
public class Sample3 {

	public static void main(String[] args) {
		B1 obj=new B1();

	}

}
