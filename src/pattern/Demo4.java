package pattern;


    


 
 

public class Demo4 {
	
//	
//      *
//     **
//    ***
//   ****
//  *****
// ******

	public static void main(String[] args) {
		int m=1;
		for(int i=6;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//System.out.print("%");
			for(int k=0;k<m;k++)
			{
				System.out.print("*");
			}
			m++;
			System.out.println();
		}
		
		
		System.out.println("/////////////////");
		
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			//System.out.print("%");
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		

		
	}

}
