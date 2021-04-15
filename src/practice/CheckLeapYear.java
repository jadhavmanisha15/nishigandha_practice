package practice;

public class CheckLeapYear {

	public static void main(String[] args) {
		
		
		//divisible by 4 for all the century year -- ending with 00
		//century year is leap year only when it is divisible by 400
		
		//1900 is not a leap year because it is not divisible by 400
		//2012 is leap year because it is divisible by 4
		
		int year=2000;
		
		
		 if(year%100==0)
		{
			if(year%400==0)
			{
				System.out.println(year+" is leap year");
				}
			else
				System.out.println(year+" is not a leap year");
			
		}
		 else if(year%4==0)
			{
				System.out.println(year+" is leap year");
			}
		 
		else
			System.out.println(year+" is not a leap year");
		
			
		
	}

}
