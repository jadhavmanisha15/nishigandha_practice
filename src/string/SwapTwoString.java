package string;

public class SwapTwoString {

	public static void main(String[] args) {
		
		
		String s="hii";
		String b="hello";
		
		String temp=s;
		s=b;
		b=temp;
		
		System.out.println(s);
		System.out.println(b);
		
		
		
		//without using temp
		
		s=s+b;
		b=s.substring(0, s.length()-b.length());
		s=s.substring(b.length(), s.length());
		System.out.println(s+"    "+b);
		
	}

}
