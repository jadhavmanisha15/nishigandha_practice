package practice;

public class FactorsOfNum {

	public static void main(String[] args) {
		
		
		int num=10;
		System.out.println("Factors of number "+num);
		for(int i=1;i<=10;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
