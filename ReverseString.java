package programming;

public class ReverseString {
	public static void main(String args[]){
		
		String a="program";
		System.out.println("length is"+a.length());
		for(int i=0;i<a.length();i++){
	System.out.print(a.charAt(i));
		}
		System.out.println(" ");
	
	for(int j=a.length()-1;j>=0;--j){
		 
		System.out.print(a.charAt(j));
	}
	//System.out.println(a);
	}

}
