import java.util.Random;
public class RandomMonth {
	public static void main(String[] args) {
		Random rand = new Random();
		double month = (int)(Math.random() * 12 + 1);
		
		if (month == 1) {
			System.out.print("1, January");
		}
		else if (month == 2) {
			System.out.print("2, February");
		}
		else if (month == 3) {
			System.out.print("3, March");
		}
		else if (month == 4) {
			System.out.print("4, April");
		}
		else if (month == 5) {
			System.out.print("5, May");
		}
		else if (month == 6) {
			System.out.print("6, June");
		}
		else if (month == 7) {
			System.out.print("7, July");
		}
		else if (month == 8) {
			System.out.print("8, August");
		}
		else if (month == 9) {
			System.out.print("9, September");
		}
		else if (month == 10) {
			System.out.print("10, October");
		}
		else if (month == 11) {
			System.out.print("11, November");
		}
		else {
			System.out.print("12, December");
		}
	}
}
//silvs code