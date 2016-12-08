 /* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Final Project
 */
import java.util.Scanner;
public class CMPT220Project {
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int priorityPoints = 0;
    int clubPoints = 0;
    int sportsPoints = 0;
    int historyPoints = 0;
    int roomPoints = 0;
    int servicePoints = 0;
    int iSportsPoints = 0;
    System.out.println("Please enter the following: ");
    System.out.print("Current GPA: ");
    double GPA = input.nextDouble();
    if (GPA >= 3.85) {
      System.out.println(12 +" points");
      priorityPoints += 12;
    }
    else if (GPA >= 3.60) {
      System.out.println(11 +" points");
      priorityPoints += 11;
    }
    else if (GPA >= 3.25) {
      System.out.println(10 +" points");
      priorityPoints += 10;
    }
    else if (GPA >= 3.00) {
      System.out.println(9 +" points");
      priorityPoints += 9;
    }
    else if (GPA >= 2.75) {
      System.out.println(7 +" points");
      priorityPoints += 7;
    }
    else if (GPA >= 2.50) {
      System.out.println(6 +" points");
      priorityPoints += 6;
    }
    else if (GPA >= 2.25) {
      System.out.println(5 +" points");
      priorityPoints += 5;
    }
    else if (GPA >= 2.00) {
      System.out.println(4 +" points");
      priorityPoints += 4;
    }
    else if (GPA >= .50) {
      System.out.println(1 +" point");
      priorityPoints += 1;
    }
    else {
      System.out.println(0 +" points");
      priorityPoints += 0;
    }   
    System.out.print("Amount of Clubs involved in: ");
    double clubs = input.nextDouble();
    if(clubs != 0){
      System.out.println("Please enter 'yes' or 'no' to the following question");
      System.out.println("Have you attended more than half of the club's meetings?");
      String answer = input.next();
      if (answer == "yes"){
        System.out.println(clubs * 2 +" points");
        clubPoints += clubs * 2;
      }
      else{
        System.out.println(clubs * 1 +" point");
        clubPoints += clubs * 1;
      }
      System.out.println("Please enter 'yes' or 'no' to the following question");
      System.out.println("Were you the President/Vice President/Secretary or Treasurer?: ");
      String PosAnswer = input.next();
      if (PosAnswer.equals("yes")){
        System.out.println(3 +" points");
        clubPoints += 3;
      }
      else{
        System.out.println(0 +" point");
        clubPoints += 0;
      }
    }
    System.out.println("Please enter 'yes' or 'no' to the following question");
    System.out.println("Are you involved in Marist College's Athletics?: ");
    String SportsAnswer = input.next();
    if (SportsAnswer == "yes"){
      System.out.println("How many sports?");
      double sports = input.nextDouble();
      System.out.println(sports * 2 +" points");
      sportsPoints += sports * 2;
    }
    else{
      System.out.println(0 +" points");
      sportsPoints += 0;
    }
    System.out.println("Please enter 'yes' or 'no' to the following question");
    System.out.println("Are you involved in Marist College's Intramurals?: ");
    String iSportsAnswer = input.next();
    if (iSportsAnswer == "yes"){
      System.out.println("How many sports?");
      double isports = input.nextDouble();
      System.out.println(isports * 2 +" points");
      iSportsPoints += isports * 2;
    }
    else{
      System.out.println(0 +" points");
      iSportsPoints += 0;
    }
    System.out.println("Please enter 'yes' or 'no' to the following question");
    System.out.println("Do you have a Discipline History with Marist College this semster?");
    String historyAnswer = input.next();
    if (historyAnswer == "yes"){
      System.out.println(0 +" points");
      historyPoints += 0;
    }
    else{
      System.out.println(6 +" points");
      historyPoints += 6;
    }
    System.out.println("Please enter 'good' or 'bad' to the following question");
    System.out.println("In what condition was your room?");
    String roomAnswer = input.next();
    if (roomAnswer.equals("good")){
      System.out.println(4 +" points");
      roomPoints += 4;
    }
    else{
      System.out.println(0 +" points");
      roomPoints += 0;
    }
    System.out.println("Please enter 'yes' or 'no' to the following question");
    System.out.println("Did you participate in any Service activities?");
    String serviceAnswer = input.next();
    if (serviceAnswer.equals("yes")){
      System.out.println("How many hours?");
      double hours = input.nextDouble();
      System.out.println(hours * 1 +" points");
      servicePoints += hours * 1;
    }
    else{
      System.out.println(0 +" points");
      servicePoints += 0;
    }
    double totalAverage = (priorityPoints + clubPoints +sportsPoints + historyPoints+roomPoints+servicePoints+ iSportsPoints); 
    System.out.println("Your total priority points is: " + totalAverage);
    System.out.println("Please enter your classificaition: [example: 'freshman']");
    String classAnswer = input.next();
    if (classAnswer.equals("freshman")){
      System.out.println("Your housing options are:");
      System.out.println("Leo Hall");
      System.out.println("Champagnat Hall");
      System.out.println("Marian Hall");
      System.out.println("Sheahan Hall");
    }
    if (classAnswer.equals("sophomore")){
      System.out.println("Your housing options are:");
      System.out.println("Midrise Hall");
      System.out.println("Foy Townhouses (A-C)");
      System.out.println("New Townhouses (H-M)");
      System.out.println("Lower West Cedar St Townhouses (N-S)");
      System.out.println("Upper West Cedar St Townhouses (T-Y");
    }
    else{
      System.out.println("Your housing options are:");
      System.out.println("Building A");
      System.out.println("New Fulton Townhouses");
      System.out.println("Fulton Street Townhouses");
      System.out.println("Talmadge Court");
    }
    System.out.println("Please enter 'yes' or 'no' to the following question");
    System.out.println("Would you like to calulate you and 3 others priority points average?");
    String avgAnswer = input.next();
    if (avgAnswer.equals("yes")){
      System.out.println("Please enter the 4 priority points");
      double avg = input.nextDouble();
      double avg2 = input.nextDouble();
      double avg3 = input.nextDouble();
      double avg4 = input.nextDouble(); 
      double avgAverage = ((avg + avg2 + avg3 + avg4) / 4);
      System.out.println(avgAverage);
    }
    else{
      System.out.println("okay then! Thank you for using Ariele's Priority Point Calculator!");
    }
  }
}
//silvs code