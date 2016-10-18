// == missing header
import java.util.Scanner;
public class CelsiusFahrenheit {
  // == tabs!!
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		System.out.println("Input Celsius Degree: ");
		double celsius = input.nextDouble();
		celsius = ((9.0 / 5) * celsius) + 32;
		System.out.println("Your temperture in Fahrenheit is: " + celsius);
		
	}
}

//silvs code
