/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
import java.util.Scanner;
public class PosNegNum {
	public static void main(String[] args){
		int data;
		int sum = 0;
		int pos = 0;
		int neg = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("enter an integer, the input ends if it is 0: ");
		do {
		data = input.nextInt();
		sum += data;
		if (data < 0){
			neg = neg + 1;
		}
		if (data > 0){
			pos = pos + 1;
		}
		} while (data!= 0);
		double total = pos + neg;
		if (total == 0){
			System.out.print("no numbers are entered except 0");
		}
		else{	
			double subtotal = sum / total;
			System.out.println("the number of positives is " + pos);
			System.out.println("the number of negatives is " + neg);
			System.out.println("the total is " + sum);
			System.out.println("the average is " + subtotal);
		}
	}
}
//silvs code