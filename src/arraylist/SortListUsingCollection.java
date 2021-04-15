package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortListUsingCollection {

	public static void main(String[] args) {


ArrayList<String> list=new ArrayList<String>();
		
		
		list.add("a");
		list.add("z");
		list.add("v");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
