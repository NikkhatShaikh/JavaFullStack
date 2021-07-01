package filehandling;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("src/filehandling/FileDemo.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String str = " Welcome To India!!!";
            byte[] bt = str.getBytes();
            fileOutputStream.write(bt);
            System.out.println("File saved!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i= fileInputStream.read();
            while (i>0){
                System.out.print((char)i);
                i=fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
