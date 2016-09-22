package programming;

public class ExceptionHandling {
	public static void main(String args[]){
		
	
	 String str = null;
	 try{
	
	if(str.equals("Test")) {
	System.out.println("yes");
	}
	 }catch(Exception e){
		System.out.println("Null pointer Exceptionc handled");
	}
	 }
}

