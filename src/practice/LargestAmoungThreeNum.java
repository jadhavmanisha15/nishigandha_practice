package practice;

public class LargestAmoungThreeNum {

	public static void main(String[] args) {
		


		int x=100;
		int y=200;
		int z=800;
		
		if(x>y && x>z)
		{
			System.out.println(x+" is largest number");
		}
		else if(y>x && y>z)
		{
			System.out.println(y+" is largest number");
			
		}
		else
		{
			System.out.println(z+" is largest number");
		}
			
	}

}
