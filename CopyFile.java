package programming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
	
		File f1=new File("C:\\Users\\mohan\\Desktop\\swetha\\note.txt");
		File f2=new File("C:\\Users\\mohan\\Desktop\\swetha\\note1.txt");
		FileInputStream instream=null;
		
		FileOutputStream outstream=null;
		
		try{
		 instream = new FileInputStream(f1);
 	    outstream = new FileOutputStream(f2);

 	    byte[] buffer = new byte[1024];

 	    int length;
 	    /*copying the contents from input stream to
 	     * output stream using read and write methods
 	     */
 	    while ((length = instream.read(buffer)) > 0){
 	    	outstream.write(buffer, 0, length);
 	    }

 	    //Closing the input/output file streams
 	    instream.close();
 	    outstream.close();

 	    System.out.println("File copied successfully!!");

 	}catch(IOException ioe){
 		ioe.printStackTrace();
 	 }
 }


	}


