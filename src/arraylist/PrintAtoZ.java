package arraylist;

import java.util.ArrayList;

public class PrintAtoZ {

	public static void main(String[] args) {
	
		
		ArrayList< Character> list=new ArrayList<Character>();
		for(char i=97;i<=122;i++)
		{
		
			list.add(i);
		}
		System.out.println(list);
		
	}

}
