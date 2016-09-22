package programming;

//import java.util.Arrays;

public class Sorting {
	
	public static void main(String args[]){
		
		int[] a = { 5, 8, 14, 1, 56};
		int temp;
		int n=a.length;
		try{
			  for (int i = 0; i < n; i++) 
		        {
		            for (int j = i + 1; j < n; j++) 
		            {
		                if (a[i] > a[j]) 
		                {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		        }
		       
		        for (int i = 0; i < n; i++) 
		        {
		            System.out.print(a[i] + ",");
		        }
		       // System.out.print(a[n-1]);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
	

	

