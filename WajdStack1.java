/*
* Copyright (c) 2020
*
* The WajdStack1 Class creates a stack to use 
* by the PopStacj.java program, and has different methods to process.
* 
* @author  Wajd Mariam
* @version 2.0
* @since   2020/12/09
*/

// import the ArrayList class
import java.util.ArrayList; 

public class WajdStack1 {
  
  // Creating and Array List:
  private ArrayList<Integer> stackArray = new ArrayList<Integer>();

  /**
   * This method add the integer inputted and 
   * returns the Integer that has been added to the stack.
   */
  public Integer push(int add) {
    stackArray.add(add);
    return this.stackArray.get(stackArray.size() - 1);
  }
  
  /**
   * This method pops the top number off the stack and returns it.
   */
  public Integer pop() {
    int poppedNumber = this.stackArray.get(stackArray.size() - 1);
    stackArray.remove(stackArray.size() - 1);
    return poppedNumber;
  }
  
  /**
   * Returning method.
   */ 
  public String list() {
    String currentCharacters = "";
    for (int character = 0; character < stackArray.size(); character++) {
      currentCharacters = currentCharacters + stackArray.get(character) + ", ";
    } 
    return currentCharacters;
  }
}
