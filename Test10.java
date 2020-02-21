@FunctionalInterface
interface MyFunctionalInterface
{
	public String sayHello(String s);
}
public class Test10 {

	public static void main(String[] args) {
		MyFunctionalInterface msg=(name) ->{
			return name;
		};
		System.out.println(msg.sayHello("rajeev"));
	}

}
