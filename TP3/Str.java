import java.util.Scanner;
// Print factorial of n
public class Str {
   public static void Exo() {  // Set an initial breakpoint at this statement

      String inStr;        // input String
      int inStrLen;        // length of the input String
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a String: ");
      inStr = in.next();   
      inStrLen = inStr.length();
      in.close();
   
      for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
            System.out.print(inStr.charAt(charIdx));
      }
   }
   public static void main(String[] args){
        Exo();
   }
}