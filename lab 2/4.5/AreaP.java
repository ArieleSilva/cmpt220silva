/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
import java.util.Scanner;
public class AreaP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter number of sides: ");
		double n = input.nextDouble();
		System.out.print("please enter length: ");
		double s = input.nextDouble();
		//double polygonArea = ((n * (Math.pow(s, 2))) / (4 * (Math.tan(Math.PI / n))));
		double polygonArea = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		System.out.print("The area of the pentagon is " + polygonArea);
	}
}
//silvs code