package com;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ex3 {
     static void readFile() throws FileNotFoundException{
         FileReader fr=new FileReader("Sample.txt");
     }
     public static void main(String[]args) {
         try{
             readFile();
             System.out.println("File opened");
         }
         catch (FileNotFoundException e){
             System.out.println("File not found");
         }
         System.out.println("Done");
     }

}
