/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
import java.util.Scanner;
public class Palindrome {
  public static void main (String[] args){
    System.out.println("enter a number: ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();  
    int result = reverse(number);
    System.out.println(result);
    System.out.println(isPalindrome(number));
  }
  
  public static int reverse(int number){
    int result = 0;
    int rem;
    while(number > 0){
      rem = number % 10;
      number = number / 10;
      result = result * 10 + rem;
    }
    return result;
  }
  
  public static boolean isPalindrome(int number){
    boolean pal = number == reverse(number);
    return pal;
  
  }
}
//silvs code