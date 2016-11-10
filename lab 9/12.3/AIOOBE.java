 /* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 Lab 9
 */
import java.util.Random;
import java.util.Scanner;
public class AIOOBE {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] array = new int[100];
    Random rand = new Random();
    for(int i = 0; i < 100; i++){
      array[i] = rand.nextInt() + 1;
    }
    System.out.print("Please enter a value: ");
    int val = input.nextInt();
    try{
      System.out.println(array[val]);
    }catch(IndexOutOfBoundsException E){
      System.out.println("Out of Bounds");
    }
  }
}
//silvs code