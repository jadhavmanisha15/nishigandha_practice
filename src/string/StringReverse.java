package string;

public class StringReverse {

	public static void main(String[] args)
	{
		String str ="mayank";
		
		StringBuffer sb = new StringBuffer();
		
		for (int  i = str.length()-1;i >= 0; i--) 
		{
			 
			 sb.append(str.charAt(i));
		}

		if (str.equals(sb.toString())) 
		{
			System.out.println("yes");
			
		}else 
		{
			System.out.println("no");
			
		}

	}

}
