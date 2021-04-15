package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SortList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		
		list.add("a");
		list.add("z");
		list.add("v");
		System.out.println(list);
		Object[] a=list.toArray();
		
		Arrays.sort(a);
		list.clear();
	    for (Object data : a) {
	    	list.add((String) data);
	    	
		}
	    
	    System.out.println(Arrays.toString(a));
	    System.out.println(list);
	}

}
