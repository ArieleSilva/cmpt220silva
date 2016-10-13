/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 5
 */
import java.util.Arrays;
import java.util.Scanner;
public class SelectionStart {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter 10 list: ");
    double[] array = new double[10];
    for (int num = 0; num < array.length; num++){
      array[num] = input.nextDouble();
    }
    selectionSort(array);
  }
  public static void selectionSort(double[] list) {
    for (int i = list.length - 1; i > 1 ; i--) {
      int currentMaxIndex = i;
      double currentMax = list[i];

      for (int k = i - 1; k > 0; k--) {
        if (currentMax < list[k]) {
          currentMaxIndex = k;
          currentMax = list[k];
        }
      }
      if (currentMaxIndex != i) {
        double temp = list[currentMaxIndex];
        list[currentMaxIndex] = list[i];
        list[i] = temp;
      }
    }
    for (int a = 0; a < list.length; a++) {
      System.out.print(list[a] + " ");
    }
  }
}
//silvs code