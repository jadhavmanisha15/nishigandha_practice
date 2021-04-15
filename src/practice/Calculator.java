package practice;

import java.io.Reader;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		double result=0;
		System.out.println("Enter operater +,-,*,/");
		
		char operater=sc.next().charAt(0);
		
		switch (operater) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;

		case '*':
			result=a*b;
			break;

		case '/':
			result=a/b;
			break;


		default:
			System.out.println("Please pass correct operater");
		}
		System.out.println(result);
	}

}
