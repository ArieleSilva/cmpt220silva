/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 5
 */
import java.util.Scanner;
public class Partition {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a 9 number list: ");
    int[] array = new int[9];
    for (int num = 0; num < array.length; num++){
      array[num] = input.nextInt();
    }
    partition(array,5);
  } 
  public static int partition(int[] list, int pivot) {
    int []resultList = new int[list.length];
    int endIndex = 0;
    //This loop puts all the numbers less that pivot into the loop
    for(int i = 0; i < list.length; i++) {
      if (list[i] < pivot){
        resultList[endIndex] = list[i];
        endIndex++;
      }
    }

    //This loop puts all the numbers are equal to the pivot into the loop
    for(int i = 0; i < list.length; i++) {
      if (list[i] == pivot){
        resultList[endIndex] = list[i];
        endIndex++;
      }
    }

    //This loop puts all the numbers that are greater than the pivot
    for(int i = 0; i < list.length; i++){
      if(list[i] > pivot){
        resultList[endIndex] = list[i];
        endIndex++;
      }
    }
    for(int i = 0; i < list.length; i++) {
      System.out.println(resultList[i]);
    }      
    //Print out everything in result list
    return pivot;
  }   
}
//silvs code