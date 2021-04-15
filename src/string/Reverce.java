package string;

public class Reverce {

	public static void main(String[] args) {
		
		
		String str="Nishigandha Sawant";
		String s[]=str.split(" ");
		 
		for(int i=s.length-1;i>=0;i--)
		{
		
			
//			for(int j=s[i].length()-1;j>=0;j--)
//			{
//				System.out.print(s[i].charAt(j));
//			}
			
			System.out.print(s[i]+" "+" ");
		}
		
	}

}
