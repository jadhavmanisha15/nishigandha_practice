package string;

public class Demo extends Demo1
{
	static int a=10;

	
//	Demo(int a)
//	{
//		this.a;
//	}

	public static void m1()
	{
		System.out.println("static method ");
	}

	public void m2()
	{
		System.out.println("simple method");
		int s=super.b;
	}
	public void m()
	{
		this.m1();
		this.m2();
		System.out.println(a);
		super.m3();
		super.m4();
	}

	public static void main(String[] args) {

		Demo obj=new Demo();

		obj.m();
	}

}
