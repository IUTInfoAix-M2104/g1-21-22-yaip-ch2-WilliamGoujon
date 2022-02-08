import java.util.Scanner;

public class Exo61 {
    public static void Exo61() {
       Scanner in =new Scanner(System.in);
       System.out.print("Entrer une valeur");
       int size = in.nextInt();
       in.close();
      for (int row = 1; row <= size; row++) {  
         for (int col = 1; col <= size; col++) { 
            System.out.print( "# " );   
            
         }
         System.out.println();
      }
    }

    public static void main(String[] args){
       Exo61();
    }
}