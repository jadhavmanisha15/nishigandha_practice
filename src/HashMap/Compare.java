package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Compare {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mp1=new HashMap<Integer, String>();
		mp1.put(1, "Java");
		mp1.put(2, "C#");
		mp1.put(3, "Java");
		
		HashMap<Integer, String> mp2=new HashMap<Integer, String>();
		mp2.put(1, "Java");
		mp2.put(2, "C#");
		mp2.put(3, "Java");
		
		
		System.out.println(mp1.keySet().equals(mp2.keySet()));
		System.out.println(mp1.values().equals(mp2.values()));
		ArrayList<String> l=new ArrayList<String>(mp1.values());
		ArrayList<String> l2=new ArrayList<String>(mp2.values());
		System.out.println(l.equals(l2));
		
		
		

		HashSet<String> s11=new HashSet<String>(mp1.values());
		HashSet<String> s12=new HashSet<String>(mp2.values());
		
	System.out.println(s11.equals(s12));
	
	
	
		mp2.put(4, "Java");
		ArrayList<String> li1=new ArrayList<String>(mp1.values());
		ArrayList<String> li2=new ArrayList<String>(mp2.values());
		System.out.println(li1.equals(li2));
		
		HashSet<String> s=new HashSet<String>(mp1.values());
		HashSet<String> s1=new HashSet<String>(mp2.values());
		
	System.out.println(s.equals(s1));
	}

}
