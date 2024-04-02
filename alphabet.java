
import java.util.Scanner;
 
public class Main {
 
    
    static String removeNonAlphabetic(String str) {
 
         
        String result = str.replaceAll("[^a-zA-Z]", "");
 
        return result; // Return the resulting string
    }
 
    public static void main(String[] args) {
 
        String str = "Hello, how are you ?";
        String result = removeNonAlphabetic(str);
        System.out.println(result)
    }
}