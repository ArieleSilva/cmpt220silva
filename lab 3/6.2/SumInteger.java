/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
import java.util.Scanner;
public class SumInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter a number between 1 and 999: ");
    int number = input.nextInt(); 
    int result = 0;
    int rem = 0;
    while(number > 0){
      rem = number % 10;
      number = number / 10;
      result = result + rem;
    }
    System.out.println(result);
  }
}

//silvs code