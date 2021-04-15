package practice;

public class NatureSumUsingRecursion {
	
	
	
	public static int addNum(int num)
	{
		if(num!=0)
		{
			return num+addNum(num-1);
		}
		return num;
	}

	public static void main(String[] args) {
		
		
		int sum =addNum(20);
		System.out.println(sum);
		
	}

}
