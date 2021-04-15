package string;

public class RemoveWhiteSpace {
	
	
	public static String replace(String str)
	{
		String s=str.replace(" ", "");
		return s;
	}
	public static String replace1(String str)
	{
		StringBuffer sb=new StringBuffer();
		char []ch=str.toCharArray();
		
		for (char c : ch) {
			
			if(c!=' ')
			{
				sb.append(c);
			}
		}
		String s=sb.toString();
		return s;
		
	}

	public static void main(String[] args) {
		
		
		
		String str="n i s h i";
		String s=replace(str);
		System.out.println(s);
		String s1=replace1(str);
		System.out.println(s1);
	}

}
