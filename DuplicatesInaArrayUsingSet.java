package programming;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicatesInaArrayUsingSet {

	public static void main(String args[]){
	
		
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; 

		
	HashSet<String> hs=new HashSet<String>();
	
	
	for (String name : names) {
		if (hs.add(name) == false) {
			System.out.println("found a duplicate element in array : " + name);
			}
		}
		
	 Iterator<String> itr=hs.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	
	}
	}
	
	
}



