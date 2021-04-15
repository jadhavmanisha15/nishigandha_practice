
public class SingleTone {
	
	public static SingleTone obj=null;
	String s;
	
	private SingleTone()
	{
		s="hiiii";
	}
	
	public static SingleTone instantiate()
	{
		if(obj==null)
		{
			obj=new SingleTone();
		}
		return obj;
	}

	public static void main(String args[])
	{
		SingleTone obj1=instantiate();
		SingleTone obj2=instantiate();
		
		obj1.s.toUpperCase();
		
		System.out.println(obj1.s);
		System.out.println(obj2.s);
		//all these reference point to same object
	}
}
