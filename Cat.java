package programming;

public class Cat extends Animal {
	public void sleep1(){
		System.out.println("sleeping 1");
		System.out.println(s1);//private variable cant be accessed
		
	}
	
	public static void main(String args[]){
		Animal a=new Animal();
		a.sleep();//public can be accessed any where in any packeagee
		a.doSomething();//this is not accesible becoz private method is not accesed outside class
		a.eat();//this is protected method can be accesses with in the same project
	}

}
