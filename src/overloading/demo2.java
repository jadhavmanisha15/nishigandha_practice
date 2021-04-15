package overloading;

public class demo2 {
	
	void sum(int a,long b){System.out.println("a method invoked");}    
	  void sum(long a,int b){System.out.println("b method invoked");}    
	    
	  public static void main(String args[]){    
		  demo2 obj=new demo2();    
	  obj.sum(20,20l);//now ambiguity    
	  }    

}
