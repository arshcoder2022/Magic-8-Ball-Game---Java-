import java.util.*;


/**
   Magic 8 Ball Game picks a random response to a yes/no question
*/

public class ArrayError
{
   public static void main(String[] args) 
   {
      String again, answer;
      
      // Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      // Get an Array of the Magic 8 Ball responses
      String[] responses = buildList();
      
      // Random number generator
      Random rand = new Random();
      
      do
      {
         // Get the user's question
         System.out.print("What is your question? ");
         String q = keyboard.nextLine();
         
         // Display a random response
         /***************************************************************
         /
         /    TASK:
         /
         /       The assignment of the answer variable pulls
         /       a random entry from the responses array.
         /       In this program, the array only has 12 entries (index 0-11)
         /       but the random number generated here will be 
         /       between 0-49.  
         /
         /       Note that this will not cause
         /       a syntax error when you compile your program!!!
         /       This is a runtime error that occurs whenever a random
         /       number higher than 11 is generated (array out of bounds).
         /
         /       To catch this and exit gracefully, add a try clause
         /       BEFORE the assignment of the answer variable.
         /
         /       Add a catch clause for a generic exception and let the
         /       user know an unexpected error occurred.  Then let 
         /       your program continue and ask the user to if they
         /       want to ask another question.
         /*****************************************************************/
         
         //Add the try clause before the next line:
         
         try
         {
                       
            answer = responses[(rand.nextInt(50))];
            System.out.println(answer);
            
         }   
            
            
            
         
         //Add a catch clause to handle any errors that may occur accessing the array
          
         catch(Exception e)
         {
               
               answer = "Cannot determine right now";
               System.out.println(answer);
         
         }

         // Want to go again?
         System.out.print("\nDo you have another question? (yes or no): ");
         again = keyboard.nextLine();
      } while (again.equals("yes"));
   }
   
   // Returns an ArrayList containing the Magic 8 Ball responses
   public static String[] buildList() 
   {
      String[] list = {"Yes, of course!",
                                 "Without a doubt, yes.",
                                 "You can count on it.",
                                 "For sure!",
                                 "Ask me later.",
                                 "I'm not sure.",
                                 "I can't tell you right now.",
                                 "I'll tell you after my nap.",
                                 "No way!",
                                 "I don't think so.",
                                 "Without a doubt, no.",
                                 "The answer is clearly NO."}
;
      
      return list;
   }
}