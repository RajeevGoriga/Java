import java.util.Stack;
import java.util.Enumeration;

public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push("Patrick Naughton");
		s.push("James Gosling");
        s.push("Mike Shreidan");
        s.push("Chris Warth");
        s.push("Ed Frank");
        System.out.println("Stack elements:"+s);
        System.out.println("First elements:"+s.peek());
        System.out.println("Stack elements:"+s);
        System.out.println("Popping Out:"+s.pop());
        System.out.println("Stack elements:"+s);
        s.push("java");
        System.out.println("after adding:"+s);
        System.out.println("Popping out:"+s.pop());
        System.out.println("Stack elements:"+s);
        System.out.println("First element:"+s.peek());
        Enumeration e=s.elements();
        System.out.println("elements are:");
        while(e.hasMoreElements())
        {
        	System.out.println(e.nextElement());
        }
        }

}
