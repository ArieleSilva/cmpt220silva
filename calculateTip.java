import java.util.Scanner;
public class CalculateTip {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double TipAmount = input.nextDouble();
		double total = subtotal * (TipAmount / 100);
		double bill = subtotal + total;
		System.out.println("The gratuity is $" + total + " and total is $" + bill);
		
	}
}

//silvs code