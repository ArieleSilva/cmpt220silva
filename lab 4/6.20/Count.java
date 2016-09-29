/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 4
 */
import java.util.*;
import java.util.Scanner;
public class Count {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a String...");
    String thing = input.nextLine();
    System.out.print(CountLetters(thing));
  }
  public static int CountLetters(String thing){
    int counter = thing.length();
    return counter;
  }
}
//silvs code