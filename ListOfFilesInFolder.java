package programming;

import java.io.File;

public class ListOfFilesInFolder {

	public static void main(String[] args) {
		
File f=new File("C:\\Users\\mohan\\Desktop\\swetha");
boolean b=f.isDirectory();
System.out.println(b);
if(f.isDirectory()){
	File[] f1=f.listFiles();
	for(File f2:f1){
	System.out.println(f2.getName());
}

	}

	}
}
	
