package encapsulation;

public class EncapsulationExample {

	private int age; 
	 private String name; 
	  
	 public void setDetails(int age,String name) //getter and setter methods should be public always
	 { 
	 	this.age=age; 
	 	this.name=name; 
	 	 
	 } 
	 public void getDetails() 
	 { 
	 	System.out.println(age+" "+name); 
	 }

}
