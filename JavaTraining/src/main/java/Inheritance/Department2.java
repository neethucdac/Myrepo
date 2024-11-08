package Inheritance;

public class Department2 extends College{
	public void run() 
 	{ 
 	 
 	System.out.println("run"); 
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department1 obj=new Department1();
		obj.display();
		obj.show();
		Department2 obj1=new Department2();
		obj1.run();
		obj1.show();

	}

}
