// == missing header
import java.util.Scanner;

public class SumDigits {
  // == tabs!
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number between 0 and 1000: ");
		int number = input.nextInt();
			int onesPlace = number % 10;		
			number /= 10;					
				int tensPlace = number % 10;		
				number /= 10;				
					int hundredsPlace = number % 10;	
					number /= 10;				
						int total = hundredsPlace + tensPlace + onesPlace;
		System.out.println("The total of the numbers are " + total);
	}
}

//silvs code
