package string;

public class RemoveUnwanted {

	public static void main(String[] args) {
		
		
		
		String s="@#$$ #$&# Nishigandha ^&";
		
		
		String b=s.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(b);
		
		String a=s.replaceAll("#", "sawant");
		System.out.println(a);
	}

}
