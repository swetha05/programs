package programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceStringInaFile {
	public static void main(String args[]){
	File f= new File("C:\\Users\\mohan\\Desktop\\swetha\\note.txt");
	String search = "hi";
	String replace = "are";

	try{
	    FileReader fr = new FileReader(f);
	    String s;
	    String totalStr = "";
	    try (BufferedReader br = new BufferedReader(fr)) {

	        while ((s = br.readLine()) != null) {
	            totalStr += s;
	            System.out.println(totalStr);
	        }
	        totalStr = totalStr.replaceAll(search, replace);
	        FileWriter fw = new FileWriter(f);
	    fw.write(totalStr);
	    fw.close();
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}

}
}