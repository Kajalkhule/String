package String;

public class StringConstantPool {

	public static void main(String[] args) {
		 String s1 = "xyz";
	        String s2 = "xyz";
	        
          String s3 = new String("abc");
	        String s4 = new String("abc");
	        if (s1 == s2)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
            if (s3 == s4)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
 }
}


