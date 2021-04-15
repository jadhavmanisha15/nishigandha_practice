package string;

public class REverceWordInPlace {

	public static void main(String[] args) {
		
		
		String str="Hi I am nishi";
		String s[]=str.split(" ");
		for (String st : s) {
			
			for(int i=st.length()-1;i>=0;i--)
			{
				System.out.print(st.charAt(i));
			}
			System.out.print(" ");
			
		}
	}

}
