
import java.io.*;

public class Text {
 public static void main(String args[]) {
    Reader reader = new Reader("C:\\Users\\tuk'S\\kavya.txt");
    try {
        System.out.println("count " + reader.readFile());
    }catch (IOException e){
        System.out.println("something went wrong"+e);
    }
 }
 }

