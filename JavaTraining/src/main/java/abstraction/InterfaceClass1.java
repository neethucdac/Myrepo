package abstraction;

public class InterfaceClass1 implements InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClass1 obj=new InterfaceClass1();
		obj.display();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface");
		
	}

}
