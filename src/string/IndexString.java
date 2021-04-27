package string;

public class IndexString {

	public static void main(String[] args) {
		
		String str="nishigandhani";
		
		
		//System.out.println(str.indexOf("n"));
		//System.out.println(str.indexOf("n", 0));
		
		int x=0;
		
		//System.out.println("n 2nd= "+str.indexOf("n", str.indexOf("n", str.indexOf("n")+1)));
	    //System.out.println("n 3rd="+str.indexOf("n", str.indexOf("n", str.indexOf("n", str.indexOf("n")+1))+1));
		
		
		for(int i=0;i<str.length();i++)
		{
		
			
			 x =str.indexOf("n", x);
			 
			 if(x!=-1)
			 {
			System.out.println("n="+x);
			
			 }
			 else
			 {
				 break;
			 }
			 x++;
			 	
		}
	}

}

