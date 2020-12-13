/*
* Copyright (c) 2020
*
*T he PopStack file pops off the top intgeter that was added to the stack.
* 
* @author  Wajd Mariam
* @version 2.0
* @since   2020/12/09
*/

// Imports Java Classes:
import java.util.Scanner;


class PopStack {
  public static void main(String[] args) {

    // Declaring the stackArray using WajdStack Class
    WajdStack1 stackArray = new WajdStack1();
    
    // Declaring variables used:
    int sizeStack = 0;
    int intAdded = 0;
    int counter = 0;
    String popDecision = "";

    // Try Catch Statement:
    try {
      
      // Input / Process / Output
      
      // Getting size of the stack:
      Scanner input1 = new Scanner(System.in);
      System.out.print("Enter the size of the stack: ");
      sizeStack = input1.nextInt();
      
      // Entering a do/while loop add integers into the stack list:
      do {
        // Getting an integer from the user:
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number to add to the stack: ");
        intAdded = input2.nextInt();
        // Adding one to counter each time:
        counter = counter + 1;
        // Pushing the integer inputted  to the stack:
        stackArray.push(intAdded);
      } while (counter != sizeStack); 
      
      // Asking the user whether or not they want to pop off integers from stack:
      Scanner input3 = new Scanner(System.in);
      System.out.print("Would you like to pop integers off stack? (Yes)(No): ");
      popDecision = input3.nextLine(); 
      
      // If statements to proceed with user's decision:
      if (popDecision.equals("No")) {
        // Printing array list stack the user created:
        System.out.print(stackArray.list());
      } else if (popDecision.equals("Yes")) {
        // Popping off the first element in the stack and printing to user:
        System.out.print("");
        System.out.println("The popped number is " + stackArray.pop());
        // Printing array list stack the user created:
        System.out.print("");
        System.out.print("The stack after popping off the top integer: ");
        System.out.print(stackArray.list());
      }
    
    // Error Catch Statement:
    } catch (Exception e) {
      System.out.print("");
      System.out.println("ERROR."); 
    }
  }
}