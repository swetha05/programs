package programming;

public class GarbageExplicit extends Main {
	
	
	  public GarbageExplicit(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	   {
	      
	       Main a1 = new Main(10);
	 
	       Main a2 = new Main(20);      
	 
	       //Assigning a2 to a1
	 
	       a1 = a2;
	     
	       System.gc();
	 System.out.println(" hi before gc");
	       System.out.println("done");
	       
	   }
	}


