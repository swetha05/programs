package programming;

public class SwapWithoutThirdVar {

	
	public void swap(int x,int y){
	System.out.println("F1is"+x);
	System.out.println("F2 is"+y);
	int temp=x;
	x=y;
	y=temp;
	System.out.println("F1is"+x);
	System.out.println("F2 is"+y);
}
	public void swap1(int x,int y){
		System.out.println("F1is"+x);
		System.out.println("F2 is"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("F1is"+x);
		System.out.println("F2 is"+y);
	}
	public static void main(String args[]){
		SwapWithoutThirdVar s=new SwapWithoutThirdVar();
		s.swap(3, 5);
		s.swap1(5, 6);
		
		
	}
}


