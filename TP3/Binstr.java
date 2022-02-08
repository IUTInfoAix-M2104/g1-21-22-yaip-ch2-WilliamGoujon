import java.util.Scanner;
//exo8.1
// Print factorial of n
public class Binstr {
   public static void Exo(){
      String inStr;     
      int inStrLen;     
      char inChar;      
      boolean isValid;  

      Scanner in =new Scanner(System.in);
       System.out.print("Entrer une chaîne de caractère");
       inStr = in.next();
       inStrLen = inStr.length();
       in.close();
      
      isValid = true;  // Assume that the input is valid, unless our check fails
      for (int i =0; i< inStrLen; ++i) {
         inChar = inStr.charAt(i);
         if (!(inChar == '0' || inChar == '1')) {
            isValid = false;
            break;  // break the loop upon first error, no need to continue for more errors
                    // If this is not encountered, isValid remains true after the loop.
         }
      }
      if (isValid) {
         System.out.println("is Binary");
      } else {
         System.out.println("is Not Binary");
      }
      // or using one liner
      //System.out.println(isValid ? ... : ...);
   }
   public static void main(String[] args){
        Exo();
   }
}


