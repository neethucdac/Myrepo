package Inheritance;
//Multilevel Inheritance
public class Child extends Parent{
	public void run() 
 	{ 
 	 
 	System.out.println("run"); 
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj=new Child();
		obj.display();
		obj.run();
		obj.show();

	}

}
