import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class mapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> map = new TreeMap<String,String>((s1,s2)->s2.compareTo(s1));
			
		map.put("Karnataka", "Bangalore");
		map.put("TamiNadu", "Chennai");
		map.put("AndhraPradesh", "Vijaywada");
		map.put("Maharashtra", "Mumbai");
		
		Set<String> set = map.keySet();
		for(String key:set) {
			String val = map.get(key);
			System.out.println(key+" - "+val);
		}
		
	}

}
