abstract class Animal
{
	abstract void eat();
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("only non-veg");
	}
}
class Goat extends Animal
{
	void eat()
	{
		System.out.println("only veg");
	}
}
public class Text4 {
	public static void main(String[] args) {
		
	
	Animal m;
	m=new Tiger();
	m.eat();
	m=new Goat();
	m.eat();
	}
}
