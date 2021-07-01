package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("FHD.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String str  = " WelCome To India!!";
        byte[] bt = str.getBytes();
        fileOutputStream.write(bt);
        System.out.println(" File Saved!!!");

        FileInputStream fileInputStream = new FileInputStream(file);
         int i =fileInputStream.read();
         while (i>0){
             System.out.print((char)i);
             i=fileInputStream.read();
         }
    }
}
