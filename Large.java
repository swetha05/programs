package programming;

public class Large {
	
	public static void main(String args[]){
		int[] a={200,34,123,12,22,100};
		int lar=a[0];
		for (int j=1;j<a.length;j++) {
			if(a[j]>lar){
				lar=a[j];
			}
		}
		System.out.println("The largest number is"+lar);
 }
}
