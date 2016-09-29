/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
import java.util.Scanner;
public class BubbleSort {
  public static void main(String[] args){
    double[] array =  new double[10];
    Scanner input = new Scanner(System.in);
    System.out.print("please enter 10 numbers: ");
    for (int count = 0; count < array.length; count++) {
      array[count] = input.nextDouble();
    }
    double answerArray[] = bubble(array);
    //Print out each variable in array
    for(int i = 0; i < answerArray.length; i++){
      System.out.print(answerArray[i] + " ");
    }
  }
  public static double[] bubble(double[] array) {
    double answerArray[] = array;
    //Performing swapping algorithm as long as the given array is
    for(int j = 0; j < array.length; j++){
      for (int i = 0; i < array.length; i++){
        //Saving from index error
        if(i == array.length-1){
          break;
        }
        //Holding first value, and next value
        double currentIndex = array[i];
        double index = array[i+1];
        //Actual Swap
        if(currentIndex < index){
          double temp = index;
          answerArray[i+1] = currentIndex;
          answerArray[i] = temp;
        }
      }
    }
    return answerArray;
  }    
}
//silvs code