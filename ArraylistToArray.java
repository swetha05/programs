package programming;

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
       al.add("hello");
       al.add("world");
       al.add("hello1");
       al.add("java");
       
       String array[] = new String[al.size()];              
		for(int j =0;j<al.size();j++){
		  array[j] = al.get(j);
		  
		  for(String k: array)
			{
				System.out.println(k);
			}
		}
	}

}
