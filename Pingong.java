package programming;

public class Pingong {
	
public static void main(String args[]){
	// int flag=1;
	for (int i=1;i<=50;i++){
		if(i%3==0){
System.out.println(i+"ping");	
		}
		if(i%5==0){
			System.out.println(i+"pong");
		}
		if (i%3==0 && i%5==0){
			System.out.println(i+"ping pong");	
	}
		
}
}
}