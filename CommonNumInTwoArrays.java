package programming;

public class CommonNumInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int[] b={2,3,7,8,9,4,5};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					System.out.println(b[j]);
			}
		}

	}

}
