package programming;

public class MethodOverriding extends MethodOverloading {
double a,c;	
public void add(double a,int b){
	c=a+b;
	System.out.println(c);
	
}
public static void main(String args[]){
	MethodOverriding r=new MethodOverriding();
	r.add(1.2,3);
	System.out.println("finished");
	
}
}
