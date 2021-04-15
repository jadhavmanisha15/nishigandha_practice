package string;

import java.util.Scanner;

public class ReplaceSubString 
{
	
	public static void withReplaceMethod(String str,String s1,String s2)
	{
		String s=str.replaceAll(s2, s1);
		System.out.println(s);
	
		
	}
	
	public static void withoutReplaceMethod(String str,String s1,String s2)
	{
		String [] s=str.split(" ");
		StringBuffer sbuf=new StringBuffer();
		 
		
		for (String str1 : s) {
			
			if(str1.equalsIgnoreCase(s2))
			{
				sbuf.append(s1);
				sbuf.append(" ");
			}
			else {
				sbuf.append(str1);
				sbuf.append(" ");
				
			}
			
		}
		System.out.println(sbuf.toString());
	}

	public static void main(String[] args) {
		
		
		String str="Hi I am Nishigandha";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to be replaced");
		String s1=sc.next();
		System.out.println("Enter string to replaced with");
		String s2=sc.next();
		
		
	//	withReplaceMethod(str,s1,s2);
		
		withoutReplaceMethod(str, s1, s2);
		}

}
