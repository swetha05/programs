package programming;

public class Animal {
	public String s="fred";
	protected int i=1;
	private String s1="red";
	public void sleep(){
		System.out.println("Sleeping");
		
	}
	private void dosomething(){
		System.out.println("dping something");
		System.out.println(s);
		
	}
	protected void eat(){
		System.out.println("eating");
		System.out.println(s1);
		
	}
	public static void main(String args[]){
		Animal a=new Animal();
		a.sleep();
		a.dosomething();
		a.eat();
	}

}
