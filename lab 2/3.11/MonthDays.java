import java.util.Scanner;
public class MonthDays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the month: ");
		int month = input.nextInt();
		String months;
		months = "";
		System.out.print("please enter the year: ");
		int dates = input.nextInt();
		String date;
		date = "";
		switch (month % 12) {
		case 1: months = "January";  date = "31"; break;
		case 2: months = "February"; break;
		case 3: months = "March"; date = "30"; break;
		case 4: months = "April"; date = "31"; break;
		case 5: months = "May"; date = "31"; break;
		case 6: months = "June"; date = "30"; break;
		case 7: months = "July"; date = "31"; break;
		case 8: months = "August"; date = "30"; break;
		case 9: months = "September"; date = "30"; break;
		case 10: months = "October"; date = "31"; break;
		case 11: months = "November"; date = "31"; break;
		case 12: months = "December"; date = "30";
		
		}
		if (months == "February"); {
		switch (dates % 4) {
		case 0: date = "29"; break;
		case 1: date = "28";
		}
	}
	
		System.out.println(months + " " + dates + " had " + date + " days ");
	}
}
//silvs code