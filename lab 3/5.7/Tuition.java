/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
public class Tuition {
  public static void main(String[] args){
    double tuition = 10000;
    double year;
    double tuitionfinal;
    double total;
    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;         
    for (year = 11; year <= 15; year++) {
      double rate = .05 * year;
      tuitionfinal = rate * tuition + tuition;
      System.out.println("The tuition for this year is " + tuitionfinal);
      if (year == 12) {
        a = tuitionfinal;
      }
      else if (year == 13) {
        b = tuitionfinal;
      }
      else if (year == 14) {
        c = tuitionfinal;
      }
      else if (year == 15) {
        d = tuitionfinal;
      }       
      }
      total = a + b + c + d;
      System.out.println("The tuition for the last four years is " + total);
      }
  }
//silvs code