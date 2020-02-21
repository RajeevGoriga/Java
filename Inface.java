interface E
{
	void met1();
}
interface D extends E
{
	void met2();
	void met3();
}
class C implements D
{
	public void met1()
	{
		System.out.println("one");
	}
	public void met2()
	{
		System.out.println("two");
	}
	public void met3()
	{
		System.out.println("three");
	}
	void disp()
	{
		System.out.println("X");
	}
}
public class Inface {

	public static void main(String[] args) {
		C a=new C();
		a.met1();
		a.met2();
		a.met3();
		a.disp();

	}

}
