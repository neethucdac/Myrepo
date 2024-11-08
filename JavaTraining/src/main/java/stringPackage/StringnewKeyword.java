package stringPackage;

public class StringnewKeyword {
	 public void StringNew() 
	 	{ 
	 		String s=new String("hello"); 
	 		System.out.println(s); 
	 	}
	 public void StringLength() 
	 	{ 
	 		String s="hai"; 
	 		System.out.println(s.length()); 
	 	}
	 public void StringSubString() 
	 	{ 
	 		String s="helloworld"; 
	 		System.out.println(s.substring(2, 4)); 
	 	}
	
	 public void StringContains() 
	 	{ 
	 		String s="java is a programming language"; 
	 		System.out.println(s.contains("java is")); 
	 	}
	
	 public void StringIsEmpty() 
	 	{ 
	 		String s1=""; //if space it is taking as character
	 		String s="hai"; 
	 		System.out.println("Empty"+s1.isEmpty()); 
	 		System.out.println("NotEmpty"+s.isEmpty()); 
	 		 
	 		 
	 	}
	
	 public void StringEquals() //CaseSensitive
	 	{ 
	 		String s="hai"; 
	 		String s1="Hai"; 
	 		System.out.println(s.equals(s1)); 
	 	}
	
	 public void StringEqualsEgnoreCase() 
	 	{ 
	 		String s="hai"; 
	 		String s1="Hai"; 
	 		System.out.println("StringEqualsIgnoreCase "+s.equalsIgnoreCase(s)); 
	 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringnewKeyword obj=new StringnewKeyword();
		obj.StringNew();
		obj.StringContains();
		obj.StringEquals();
		obj.StringIsEmpty();
		obj.StringLength();
		obj.StringEqualsEgnoreCase();
		obj.StringSubString();


	}

}
