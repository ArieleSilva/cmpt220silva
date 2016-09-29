/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 4
 */
import java.util.Scanner;
public class SmallestElement {
  public static void main(String[] args){
    double[] array =  new double[10];
    Scanner input = new Scanner(System.in);
    System.out.print("please enter 10 numbers: ");
    for (int count = 0; count < array.length; count++) {
      array[count] = input.nextDouble();
    }
    System.out.print(min(array));
  }
  public static double min(double[] array) {
    double min = array[0];
    for (int i = 0; i < array.length; i++){
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }    
}
//silvs code