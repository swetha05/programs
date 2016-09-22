package programming;

public class LinearSearch {
public static void main(String args[])
{
	int[] a={2,3,4,5,6,7,8,11,12,33,44,22};
	int search=44;
	int position=0;
	for(int i=0;i<a.length;i++){
		position++;
				if(search==a[i]){
					System.out.println(position);

		}
	}
	
	}
}
