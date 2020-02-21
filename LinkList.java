import java.util.LinkedList;
import java.util.ListIterator;

public class LinkList {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(4);
		l.add(3);
		l.add(5);
		l.add(7);
		System.out.println(l);
		l.addFirst(0);
		System.out.println(l);
		l.addLast(10);
		System.out.println(l);
		ListIterator li=l.listIterator();
		int counter=0;
		while(li.hasNext())
		{
			System.out.println("Element["+counter+"]="+li.next());
			System.out.println("-hasPrevious="+li.hasPrevious());
			System.out.println("-has next="+li.hasNext());
			System.out.println("previous index="+li.previousIndex());
			System.out.println("-nextIndex="+li.nextIndex());
			System.out.println();
			counter++;
		}
	}

}
