/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
public class LargestN {
  public static void main(String[] args){
    boolean numberfound = true;
    long large = 12000;  
    while(numberfound != false){
      if ((large * large * large) < 12000){
        numberfound = false;
      }
      else {
        large--;
      }
    }
    System.out.println(large);
  }
}
//silvs code