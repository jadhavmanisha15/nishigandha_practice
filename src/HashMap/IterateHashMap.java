package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		
		m.put(1,"Nisha1");
		m.put(2,"Nisha2");
		m.put(3,"Nisha3");
		m.put(4,"Nisha4");
		
		
		Iterator itr=m.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Integer, String> en=(Entry<Integer, String>) itr.next();
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
	}

}
