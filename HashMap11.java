package programming;
import java.util.HashMap;
//import java.util.Map;

public class HashMap11 {

	public static void main(String[] args) {
		
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	    //  for(Map.Entry m:hmap.entrySet())
	     if( hmap.containsKey(2)){
	    	 System.out.println(hmap.get(2));
	     }
	    	 

	}

}
