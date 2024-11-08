package abstraction;

public class MultipleInheritanceClass implements MultipleInheritane,MultipleInheritsnce1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MultipleInheritanceClass obj=new MultipleInheritanceClass();
		obj.display1();
		obj.display();

	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
	}

}
