import java.util.Scanner;
//exo8.9
// Print factorial of n
public class Hexa {
   public static void Exo(){
      String inStr;     
      int inStrLen;     
      char inChar;      
      boolean isValid;  

      Scanner in =new Scanner(System.in);
       System.out.print("Entrer une chaîne de caractere");
       inStr = in.next();
       inStrLen = inStr.length();
       in.close();
      
      isValid = true;  // Assume that the input is valid, unless our check fails
      for (int i =0; i< inStrLen; ++i) {
         inChar = inStr.charAt(i);

         if (!((inChar >= '0' && inChar <= '9') || (inChar >= 'A' && inChar <= 'F') || (inChar >= 'a' && inChar <= 'f'))) { 
              // Use positive logic and then reverse
            isValid = false;
            break;  // break the loop upon first error, no need to continue for more errors
                    // If this is not encountered, isValid remains true after the loop.
         }
      }
      if (isValid) {
         System.out.println("is Hexa");
      } else {
         System.out.println("is Not Hexa");
      }
      // or using one liner
      //System.out.println(isValid ? ... : ...);
   }
   public static void main(String[] args){
        Exo();
   }
}