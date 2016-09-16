import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter length: ");
		double length = input.nextDouble(); 
		double s = ((2.0 * length) * Math.sin(Math.PI / 5.0));
		double pentagonArea = ((5.0 * (Math.pow(s , 2))) / (4.0 * Math.tan(Math.PI / 5.0)));
		System.out.print("The area of the pentagon is " + (String.format("%.2f" ,pentagonArea)));
	}
}
//silvs code