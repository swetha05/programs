package programming;

public class MissingNumInArray {

	public static void main (String args[]){
	
		int[] a= {1,2,4,5,6,8,11};
		//int temp;
		/*for (int i=0;i<a.length;i++){
			if(a[i+1]=a[i]+1){
				temp=a[i+1];
			}else{
				System.out.println("the missing num is"+a[i+1]);
			}
			
	}*/
		for (int i = 1; i < a.length; i++) {
	        for (int j = 1+a[i-1]; j< a[i]; j++) {
	            System.out.println(j);
	        }
	    }
}
}