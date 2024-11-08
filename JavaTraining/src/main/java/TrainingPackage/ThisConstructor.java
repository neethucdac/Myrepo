package TrainingPackage;

public class ThisConstructor {
	 ThisConstructor() 
	 	{ 
	 		System.out.println("hello a"); 
	 		}   
	 	ThisConstructor(int x) 
	 	{   
 	this();   //invokes the default constructor first and then print the value of x
	 	System.out.println(x);   //
	 	//this(); constructor call must be the first statement in a constructor
	 	}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor a=new ThisConstructor(10);
	}

}
