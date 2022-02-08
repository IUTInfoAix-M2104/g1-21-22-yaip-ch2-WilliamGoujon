import java.util.Scanner;
// Exo 6.3
public class Table {
    public static void Exo63() {
    
     // for (int i= 1; i<= 10; ++i) {
      //    System.out.print(" * |");
       //   System.out.printf("%4d", i);
   // }

         Scanner in =new Scanner(System.in);
       System.out.print("Entrer une valeur");
       int size = in.nextInt();
       in.close();
       for (int i =1; i<= size; ++i){
           System.out.printf("%4d ", i);
       }
       System.out.println();
       for (int i =1; i<= size*5; ++i){
           System.out.printf("-", i);

       }
       System.out.println();
      for (int row = 1; row <= size; row++) {  
         for (int col = 1; col <= size; col++) { 
            System.out.printf( "%4d" ,col*row  );
            System.out.print( "|");  
            
            
         }
         System.out.println();
      }
    }   

    public static void main(String[] args){
       Exo63();
    }
}
