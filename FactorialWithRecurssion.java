package programming;

public class FactorialWithRecurssion {
	
		   public static void main(String args[]){
		      int factorial = fact(5);
		      System.out.println("Factorial of 4 is: "+factorial);
		   }
		   static int fact(int n)
		   {
		       int output;
		       if(n==1){
		         return 1;
		       }
		       //Recursion: Function calling itself!!
		       output = fact(n-1)* n;
		       return output;
		   }
		}