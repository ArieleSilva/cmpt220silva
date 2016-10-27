/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 7
 */
import java.math.BigInteger;
public class Square {
  public static void main(String[] args) {
    String temp = Long.toString((long)Math.floor(Math.sqrt(Long.MAX_VALUE)));
    String maxStringThing = Long.toString(Long.MAX_VALUE);
    BigInteger maxValue = new BigInteger(maxStringThing);
    BigInteger Square = new BigInteger(temp);
    int count = 0;
    while(count < 10){
      if(Square.multiply(Square).compareTo(maxValue) == 1){
        System.out.println(Square.multiply(Square));
        count++;
      }
      Square = Square.add(new BigInteger("1"));
    }
  }
}
//silvs code