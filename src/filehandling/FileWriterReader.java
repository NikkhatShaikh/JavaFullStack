package filehandling;

import java.io.*;

public class FileWriterReader {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        FileReader fileReader = null;
        File file = new File("javaFile.txt");
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write("Good Evening");
            System.out.println("File write Successfully...!!!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        try {
            fileReader= new FileReader(file);
          int i= fileReader.read();
           while (i>0){
               System.out.println((char)i);
               i=fileReader.read();
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
