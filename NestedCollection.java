import java.util.ArrayList;
import java.util.Iterator;

public class NestedCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> nested = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Pune");
		al1.add("Mumbai");
		al1.add("Nagpur");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Agra");
		al2.add("Mathura");
		al2.add("Kanpur");
		
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Bangalore");
		al3.add("Mysore");
		al3.add("Coorg");
		
		nested.add(al1);
		nested.add(al2);
		nested.add(al3);
		
		System.out.println(nested);
		Iterator<ArrayList<String>> itr = nested.iterator();
		while(itr.hasNext()) {			
			System.out.println("--"+itr.next());
		}
	}

}
