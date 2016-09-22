package programming;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WordsInFile {

		   public static void main(String args[]){
		   
		   try{
		      char[] bWrite  = {'w','e','r','t','h'};
		      OutputStream os = new FileOutputStream("test.txt");
		      for(int x=0; x < bWrite.length ; x++){
		         os.write( bWrite[x] ); // writes the char
		      }
		      os.close();
		     
		      InputStream is = new FileInputStream("test.txt");
		      int size = is.available();
              int count=0;
		      for(int i=0; i< size; i++){
		         System.out.print((char)is.read() + "  ");
		         count++;
		      }
		      System.out.println(count);
		      is.close();
		   }catch(IOException e){
		      System.out.print("Exception");
		   }	
		   }
		
	}

