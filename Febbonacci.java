package programming;

public class Febbonacci {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1, temp;	
	for (int i=0;i<5;i++){
		temp =f2;
		f2=f2+f1;
		f1=temp;
		System.out.println(f2);
	}
	

	}

}
