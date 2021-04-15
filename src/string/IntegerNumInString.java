package string;

public class IntegerNumInString {

	public static void main(String[] args) {
	
		String str="I will eat 2  23 1.25 cokes 18r";
		
		
		str=str.replaceAll("[^\\d]", " ");
		System.out.println(str);
		String s=str.trim();
		str = str.replaceAll(" +", " ");
		  System.out.println(str);
		  String a[]=str.split(" ");
		  System.out.println(a.length-1);
	}

}
