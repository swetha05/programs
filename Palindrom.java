package programming;

public class Palindrom {
	public static void main (String args[]){
		 String actual="liril";
		 String rev="";
		 for(int i=actual.length()-1;i>=0;i--){
			 rev=rev+actual.charAt(i);
		 }
		 System.out.println(rev);
	       if(rev.equalsIgnoreCase(actual)){
	    	   System.out.println("hi"+rev);
			 System.out.println(rev+"The string is a palindrom");
		 }
	       else
	    	   System.out.println(actual+"is not a palindriom");
		
		
	}

}
