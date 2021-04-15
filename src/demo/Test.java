package demo;

public class Test {
	int a;
	double s;
	String str;
	public Test(int a) {
		this.a=a;
	
	}
	public Test(double s) {
		this.s=s;
	
	}

	public Test(String str) {
		this.str=str;
	
	}
	Test()
	{
		
	}
	public void m(Test obj)
	{
		System.out.println(obj.a);
	}
	

	public static void main(String[] args) {
		
		/*
		 * Test obj=new Test(10),obj1=new Test("asd"),obj3=new Test(4);
		 * 
		 * System.out.println(obj1.str);
		 */	
		
		Test obj=new Test();
		 
		obj.m(obj);
		
		
	}

}
