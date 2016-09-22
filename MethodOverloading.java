package programming;

public class MethodOverloading {
	int a,b,c;
	double d;
;	public void add(int a,int b){
	 c=a+b;
	 System.out.println(c);
	 
		
	}

	public void add(int a,double b){
		
		d=a+b;
		System.out.println(d);
		
	}
	public static void main(String args[]){
		MethodOverloading m=new MethodOverloading();
		m.add(1,2);
		m.add(1,1.4);
	}
}
