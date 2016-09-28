/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 2
 */
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	System.out.println("please enter three numbers: ");
	int x = input.nextInt();
	int y = input.nextInt();
	int z = input.nextInt();
	sort(x , y, z);
	}
	public static void sort(double x, double y, double z){
		if ((x < y) && (y < z)){
			System.out.println(x + " , " + y + " , " + z);
		}
		if ((x < y) && (y > z)){
			System.out.println(z + " , " + x + " , " + y);
		}
		if ((x > y) && (y > z)){
			System.out.println(z + " , " + y + " , " + x);
		}
		if ((x > y) && (y < z)){
			System.out.println(y + " , " + x + " , " + z);
		}
	}
}

//silvs code