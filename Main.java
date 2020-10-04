import java.util.Scanner;
/**
 * This program will keep telling the user to enter a positive integer until they enter a negative integer.
 * @author Sevde
 */
public class Main {  

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    
    // create a variable for integer
    int integer;
      
      // create a do while loop 
    do{ 
      // ask the user for the integer
      System.out.println("Please enter a postive integer.Enter a negative integer to quit.");
      integer = input.nextInt();
      // create a while loop
      }while(integer >= 0);
      // tell the user the game is done
      System.out.println("All done!");
      
      
      
      }
}

    
  
    


