package TrainingPackage;

public class VariablesExamples {

	static String b="Hello";//static variable 
 	float value=16.5f; //instance variable (non-static)
 public static void main(String args[]) 
 { 
 int num1 = 5;//local variable 
 System.out.println(num1); 
 System.out.println(b); //here 'value' is not refrernced inside static method since it is non static 
 } 
 }