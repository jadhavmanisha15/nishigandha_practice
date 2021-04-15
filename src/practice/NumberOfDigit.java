package practice;

public class NumberOfDigit {

	public static void main(String[] args) {


		int num=123;
		int count=0;
		while (num !=0) {
			num=num/10; //12 1 0
			count++;
		}
		System.out.println("Number of digit "+count);
	}

}
