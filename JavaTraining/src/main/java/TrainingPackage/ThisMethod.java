package TrainingPackage;

public class ThisMethod {
	void show() 
		{ 
			System.out.println("hello m"); 
		}   
		void display() 
		{   
		System.out.println("hello n");   
		  
		this.show(); //to invoke show by just calling display
		show();//not mandatory for this in keyword
		}   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod  a=new ThisMethod ();   
 		a.display();   

	}

}
