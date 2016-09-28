/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
import java.util.Scanner;
public class ComputeChange {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		String thing = Double.toString(amount);
		int remainingAmount = (int)(amount * 100);
		int numberOfOneDolla = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberofQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		int numberofDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberofNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberofPennies = remainingAmount;
		
		System.out.println("Your amount " + amount + " consists of");
		System.out.println("     " + numberOfOneDolla + " dollars");
		System.out.println("     " + numberofQuarters + " quarters");
		System.out.println("     " + numberofDimes + " dimes");
		System.out.println("     " + numberofNickels + " nickels");
		System.out.println("     " + numberofPennies + " pennies");
	}
}
//silvs code