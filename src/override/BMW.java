package override;

public class BMW extends Car
{

	
	public BMW m()
	{
		return this;
	}
	@Override
	public void m1()
	{
		super.m1();
		System.out.println("BMW m1");
	}
	
	public static void start()
	{
		
	}
	public static void main(String []args)
	{
		
	}
}
