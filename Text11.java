import java.util.*;

public class Text11 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("raj");
		list.add("negan");
		list.add("ram");
		list.add("reddi");
		list.add("yash");
		list.forEach(
				(names) ->{
					System.out.println(names);
				}
				);

	}

}
