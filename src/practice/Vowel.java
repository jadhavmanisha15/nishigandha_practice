package practice;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Vowel {

	
	
	
	
	public static void vowelCon(char x)
	{
		
		
		if(x=='a' || x=='A'  || x=='e' || x=='E' || x=='i' ||x=='I' || x=='o' || x=='O' || x=='u' || x=='U')
		{
			System.out.println(x+" is Vowel");
		}
		else
		{
			System.out.println(x+" is consonant");
		}
	}
	
	public static void vowelConSwitch(char ch)
	{
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':	
		case 'o':
		case 'u':
			System.out.println(ch+" is Vowel");
			
			
			break;

		default:
			System.out.println(ch+" is consonant");
			
			break;
		}
	}
	
	public static void main(String[] args) {
		
		vowelCon('A');
		vowelConSwitch('y');
		
		
	}

}
