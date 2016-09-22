package programming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringInaFile {
	
public static void main(String args[]){
	double count = 0;
 
    String filePath = "C:\\Users\\mohan\\Desktop\\swetha\\note.txt";
    BufferedReader br;
    String inputSearch = "are";
   String line="";

    try {
        br = new BufferedReader(new FileReader(filePath));
        try {
            while((line = br.readLine()) != null)
            {
               
                //System.out.println(line);
                String[] words = line.split(" ");

                for (String word : words) {
                  if (word.equals(inputSearch)) {
                	   String replace="this";
                	  line.replaceFirst(inputSearch, replace);
                	  FileWriter fw = new FileWriter(filePath);
                	 fw.write(line);
                	  fw.close();
                	  
                    count++;
           
                  }
                }

               

            }
            br.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    System.out.println("Times found at--"+count);
   
}
}