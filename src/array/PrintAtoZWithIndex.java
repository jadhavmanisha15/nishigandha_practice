package array;

public class PrintAtoZWithIndex {

	public static void main(String[] args) {
		
		
		char[] array=new char[26];
		int j=0;
		for(char i='a';i<='z';i++)
		{
			array[j]=i;
			j++;
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"="+i+" ");
		}
	
	}

}
