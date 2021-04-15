package string;

public class RemoveDUplicate 
{
	public static void main(String[] args) 
	{
	
		String str = "mayank";
		boolean repeate;
		char ch[] = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int  i=0;i<ch.length;i++)
		{
			repeate = false;
			for (int j = i+1; j < ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					repeate=true;
					break;
				}
			}
			
			if (!repeate)
			{
				sb.append(ch[i]);
				
			}
			
			
		}
		System.out.println(sb);
		
			
		
	}

}
