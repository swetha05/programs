package programming;

public class CommandLine {
public static void main (String args[]){
	try{
for (int i=0;i<=args.length;i++){
	System.out.println("The arguements are:"+args[i]);
}
	}
catch(Exception e){
	System.out.println(e);
	//e.printStackTrace();
}
	
	}
}
