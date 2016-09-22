package programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;

public class SortMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println("Before Sorting:");
	         Set set = hmap.entrySet();
	         Iterator iterator = set.iterator();
	         while(iterator.hasNext()) {
	               Map.Entry me = (Map.Entry)iterator.next();
	               System.out.print(me.getKey() + ": ");
	               System.out.println(me.getValue());
	         }
	         Map<Integer, String> map = new TreeMap<Integer, String>(hmap); 
	         System.out.println("After Sorting:");
	         Set set2 = map.entrySet();
	         Iterator iterator2 = set2.iterator();
	         while(iterator2.hasNext()) {
	              Map.Entry me2 = (Map.Entry)iterator2.next();
	              System.out.print(me2.getKey() + ": ");
	              System.out.println(me2.getValue());
	         }
	    }
	//}


	}

