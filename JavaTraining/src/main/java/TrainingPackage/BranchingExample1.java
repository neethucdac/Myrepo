package TrainingPackage;

public class BranchingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 1; i <= 10; i++) {   
	            if (i  == 7) {   
	                continue; // Skip even numbers   
	            	//break;
	            }   
	            System.out.println(i);   
	        }   
	}
}