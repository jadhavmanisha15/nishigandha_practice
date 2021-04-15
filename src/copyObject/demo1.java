package copyObject;

public class demo1 {
	
	int x;
	int y;
	public demo1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		
		demo1 obj1=new demo1(3,6);
		demo1 obj2=obj1;
		System.out.println(obj1.x+"  "+obj2.x);
		obj2.x=8;
		System.out.println(obj1.x+"  "+obj2.x);
		
		
	}

}
