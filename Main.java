package programming;

public class Main {

	    int i;
	 
	    public Main(int i)
	    {
	        this.i = i;
	    }
	    protected void finalize() throws Throwable
	    {
	        System.out.println("From Finalize Method, i = "+i);
	    }
	}

