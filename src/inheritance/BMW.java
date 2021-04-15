package inheritance;

public class BMW extends Car{
	
	
	public BMW()
	{

	}
	public void  start()
	{
	super.start();
		System.out.println("BMW start");
		
	}

	public  void safty()
	{
		System.out.println("BMW");
		
		this.start();
		super.s();
	}
	
	public static void main(String args[])
	{
		BMW obj=new BMW();
		obj.safty();
	}

	
}
