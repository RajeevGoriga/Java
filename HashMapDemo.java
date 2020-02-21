import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static <K> void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put("OOP","object oriented program");
		hm.put("object","defines state and behaviour");
		hm.put("class","state and behaviour of object");
		System.out.println(hm);
		Set s=hm.entrySet();
		System.out.println();
		System.out.println("\n hashmap currennt size:"+hm.size());
		System.out.println("elements of hashmap");
		System.out.println();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(" "+ob);
		}
		TreeMap tm=new TreeMap();
		tm.put("xava is","oop");
		tm.put("java is","simple");
		tm.put("zava is","robust");
		tm.put("rama is","temporary");
		System.out.println();
		System.out.println(tm);
		System.out.println("\n elements of treemap by iteration");
		System.out.println();
		Set s1=tm.entrySet();
		Iterator itr1=s1.iterator();
		while(itr1.hasNext())
		{
			Map me=(Map) itr1.next();
			Object ob1=itr1.next();
			System.out.println(" "+ob1);
		//System.out.println(((Object) me).getValue());
		}
		System.out.println("\n treemap current size:"+tm.size());
		tm.putAll(hm);
		System.out.println("\n putting a map in to invoke the map result will sort");
		System.out.println("\n"+tm);
		//System.out.println(tm.remove("ram is")+:iam removed value);
		System.out.println("\n tree map current size:"+tm.size());
		System.out.println("\n checking specific key/value status:"+tm.containsKey("java is")+" "+tm.containsValue("temporary"));
		
	}

}
