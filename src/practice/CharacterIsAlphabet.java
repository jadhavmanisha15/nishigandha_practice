package practice;

public class CharacterIsAlphabet {

	public static void main(String[] args) {


		char ch1='$';
		int ch=ch1;
		
		
		
		if((ch>=(int)'a' && ch<=(int)'z') || (ch>=(int)'A' && ch>=(int)'Z') )
		{
			System.out.println(ch1+" character is Alphabet");
		}
		System.out.println(ch1+" character is not an Alphabet");
		
		
	}

}
