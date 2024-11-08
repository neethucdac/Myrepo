package aggregation;

public class Employee {
	String book; 
	College agg; //reference object
 	 
	Employee(String book,College agg) 
 	{ 
 		this.book=book; 
 		this.agg=agg; 
 		 	} 
	public void display()
	{
		System.out.println(book);
		System.out.println(agg.age);
		System.out.println(agg.name);
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College obj1=new College("anu",10); 
		Employee obj=new Employee("novel",obj1); 
		obj.display();
	}

}
