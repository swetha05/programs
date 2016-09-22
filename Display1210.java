package programming;

public class Display1210 {
	static int i=1;

	 public static void main(String...a)
	  {

	    if(i<=10)//suppose my range is 10000
	    {
	        System.out.println(i);
	        i++;
	        main();
	    }

	  }

	}    
	


