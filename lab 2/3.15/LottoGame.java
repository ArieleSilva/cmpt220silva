/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
import java.util.Scanner;
public class LottoGame {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("welcome to the Lottery!");
	int number = (int)(Math.random()*1000);        
	System.out.println("please enter a three digit number: ");
	int x = input.nextInt();	 
	int a = number /100;
	int b = (number % 100)/10;
	int c = number % 10;	             
	int guessA = x / 100;
	int guessB = (x % 100)/10;
	int guessC = x % 10;             
	int lotto = 0;
		if (a == guessA && b == guessB && c == guessC) {
			lotto = 0;
		}
		else if (a == guessA || a == guessB || a == guessC && b == guessA || 
				b == guessB || b == guessC && c == guessA || c == guessB || 
				c == guessC) {
		    lotto = 1;
		}
		else if (guessA == a || guessB == b || guessC == c) {
		    lotto = 2;
		}
		else {
		    lotto = 3;
		}
		 switch (lotto) {
		 case 0: System.out.println("you won! Heres $10,000!"); break;
		 case 1: System.out.println("you won 3,000 "); break;
		 case 2: System.out.println("you won 1,000 "); break;
		 case 3: System.out.println("Try again... "); break;
		}
	}
}
//silvs code