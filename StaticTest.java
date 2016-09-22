package programming;

public class StaticTest {
	public static int i=1;
	public StaticTest(){
		System.out.println("constructor");
		System.out.println(i);
	}
static{
	
	System.out.println("Static block");
	System.out.println(i);
}

public static void doSomething(){
	System.out.println("Static metho");
	
}
public void run(){
	System.out.println("run method");
	System.out.println(i);
}

public static void main(String args[]){
	StaticTest st=new StaticTest();
	StaticTest.doSomething();//static metho is called with classname.methodnam,it cant be called with the help of object ref.
	
}
	
	
}
