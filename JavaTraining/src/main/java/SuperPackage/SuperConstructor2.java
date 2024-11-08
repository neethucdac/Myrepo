package SuperPackage;

public class SuperConstructor2 extends SuperConstrutor1 {
	public SuperConstructor2()
	{
		super();//invokes parent class  even there is no super
		System.out.println("Constructor2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructor2 obj=new SuperConstructor2();

	}

}
