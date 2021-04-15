package string;

public class ReverceString {

	
	static String str="nishigandha sawant";
	
	
	public static void reverce1()
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
	}
	
	
	
	public static void reverce2() {
		// TODO Auto-generated method stub
		StringBuffer str1=new StringBuffer(str);
		str1=str1.reverse();
		StringBuilder str2=new StringBuilder(str);
		str2=str2.reverse();
		System.out.println(str1);
		System.out.println(str2);
	
	}
	
	public static void reverce3()
	{
		char[]ch=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
			rev=rev+ch[i];
		}
		System.out.println();
		System.out.println(rev);
	}
	
	
	public static void reverce4()
	{
		String s[]=str.split("");
	
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		reverce1();
		reverce2();
		reverce3();
		reverce4();
		System.out.println(str);
		}

	
}
