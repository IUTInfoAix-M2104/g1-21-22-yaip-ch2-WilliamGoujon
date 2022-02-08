 import java.util.Scanner;
//exo9.1
// Print factorial of n
public class Hexa {
   public static void Exo(){
      
// Declare variables
      tinal int NUM_ITEMS;
      int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known
      ......

      // Prompt for for the number of items and read the input as "int"
      ......
      NUM_ITEMS = ......

      // Allocate the array
      items = new int[NUM_ITEMS];

      // Prompt and read the items into the "int" array, if array length > 0
      if (items.length > 0) {
         ......
         for (int i = 0; i < items.length; ++i) {  // Read all items
            ......
         }
      }

      // Print array contents, need to handle first item and subsequent items differently
      ......
      for (int i = 0; i < items.length; ++i) {
         if (i == 0) {
            // Print the first item without a leading commas
            ......
         } else {
            // Print the subsequent items with a leading commas
            ......
         }
         // or, using a one liner
         //System.out.print((i == 0) ? ...... : ......);
      }
   }
   public static void main(String[] args){
        Exo();
   }
}