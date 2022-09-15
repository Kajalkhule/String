package String;

public class IndexInsersion {

	public static void main(String[] args) {
		String st="kajalkhule";
        String st1= "popat";
        int index = 4;
        
        String s=new String();
        
        for(int i=0;i<st.length();i++) {
            s=s+st.charAt(i);
            if(i==index) {
                s=s+st1;
            }
        }
        System.out.println(s);

	}

   }