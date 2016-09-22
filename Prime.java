package programming;

public class Prime {
	boolean isPrime(int n) {
		
		    for(int i=2;i<n;i++) {
		        if(n%i==0)
		            return false;
		    }
		    return true;
		}
	
	    //check if n is a multiple of 2
	    //if (n%2==0) return false;
	    //if not, then just check the odds
	   /* for(int i=3;i*i<n/2;i+=2) {
	        if(n%i==0)
	            return false;
	        System.out.println("is prime");
	    }
	    
	    return true;
	   // System.out.println("isnot  prime");
	}*/
	public static void main(String args[]){
		Prime p=new Prime();
	boolean b=p.isPrime(9);
	System.out.println(b);
	}

}