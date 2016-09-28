/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
import java.util.Scanner;
public class ascii {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ascii code: ");
		int ascii = input.nextInt(); 
		char ans = (char)ascii;
		System.out.println("The character for ascii code "+ascii+" is: "+ans);		
	}
}
//silvs code