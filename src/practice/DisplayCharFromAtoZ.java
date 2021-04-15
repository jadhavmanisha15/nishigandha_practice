package practice;

public class DisplayCharFromAtoZ {

	public static void main(String[] args) {
		
		
		int ch1='A';
		int ch2='Z';
		
		for(int i=ch1;i<=ch2;i++)
		{
			System.out.print((char)i+" ");
		}
		
		System.out.println();
		
		for(char i='A';i<='Z';i++)
		{
			System.out.print(i+" ");
		}
	}

}
