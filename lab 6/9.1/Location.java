/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 6
 */
import java.util.Scanner;
public class Location {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int rows = input.nextInt();
    int cols = input.nextInt();
    System.out.println("Enter the array: ");
    double[][] b = new double[rows][cols];
    for (int i = 0; i < rows; i++){
      for (int j = 0; j < cols; j++){
        b[i][j] = input.nextDouble();
      }
    }
    Location Location2 = locateLargest(b);
    System.out.print("the location of the largest element is " + Location2.maxValue + " at " + "(" + Location2.row + "," + Location2.column + ")");
  }
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;

  public static Location locateLargest(double[][] a){
    Location Location1 = new Location();
    Location1.maxValue = a[0][0];
    for (int i = 0; i < a.length; i++){
      for (int j = 0; j < a[i].length; j++){
        if (Location1.maxValue < a[i][j]){
          Location1.maxValue = a[i][j];
          Location1.row = i;
          Location1.column = j;
        }
      }
    }
    return Location1;
  }    
}
//silvs code