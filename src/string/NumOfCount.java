package string;

public class NumOfCount {

	public static void main(String[] args) {
		String s = "Sharma is a good player and he is so punctual";  
		/*
		 * String words[] = s.split(" ");
		 * System.out.println("The Number of words present in the string are : "+words.
		 * length);
		 */
		
		
		int cnt=0;
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)!=32)
			{
				cnt++;
			}
			
		}
		System.out.println(cnt);
	}

}
