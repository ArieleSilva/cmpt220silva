// == missing header
import java.util.Scanner;
public class Grades {
  // == tabs!
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println("enter the following as percentages: ");
			System.out.print("midterm exam: ");
				double midtermExam = input.nextDouble();
			System.out.print("final exam: ");
				double finalExam = input.nextDouble();
			System.out.print("projects: ");
				double project = input.nextDouble();
			System.out.print("homeworks and labs: ");
				double hwLab = input.nextDouble();
				double totalAverage = (midtermExam + finalExam + project + hwLab) / 4; 
			System.out.println("your final grade is: " + totalAverage);
		
	}
}

//silvs code
