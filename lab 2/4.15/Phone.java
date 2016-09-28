/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
import java.util.Scanner;
public class Phone {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a letter: ");
		String number = input.next();
		char letter = number.charAt(0);
		
		if (letter == 'a' || letter == 'b'|| letter == 'c' ||
			letter == 'A' || letter =='B' || letter == 'C') {
			System.out.print("the corresponding number is 2");
		}
		else if (letter == 'd' || letter == 'e'|| letter == 'f' ||
				letter == 'D' || letter =='E' || letter == 'F'){
			System.out.print("the corresponding number is 3");
		}
		else if (letter == 'g' || letter == 'h'|| letter == 'i' ||
				letter == 'G' || letter =='H' || letter == 'I'){
			System.out.print("the corresponding number is 4");
		}
		else if (letter == 'j' || letter == 'k'|| letter == 'l' ||
				letter == 'J' || letter =='K' || letter == 'L') {
			System.out.print("the corresponding number is 5");
		}
		else if (letter == 'm' || letter == 'n'|| letter == 'o' ||
				letter == 'M' || letter =='N' || letter == 'O') {
			System.out.print("the corresponding number is 6");
		}
		else if (letter == 'p' || letter == 'q'|| letter == 'r' || letter == 's' ||
				letter == 'P' || letter =='Q' || letter == 'R' || letter == 'S') {
			System.out.print("the corresponding number is 7");
		}
		else if (letter == 't' || letter == 'u'|| letter == 'v' ||
				letter == 'T' || letter =='U' || letter == 'V') {
			System.out.print("the corresponding number is 8");
		}
		else if (letter == 'w' || letter == 'x'|| letter == 'y' || letter == 'z' ||
				letter == 'W' || letter =='X' || letter == 'Y' || letter == 'Z') {
			System.out.print("the corresponding number is 9");
		}
		else {
			System.out.print(number + " is not vaild");
		}
	
	}

}
//silvs code