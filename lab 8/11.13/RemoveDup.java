 /* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 Lab 8
 */
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class RemoveDup {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter ten integers: ");
    ArrayList list = new ArrayList(10);
    for (int i = 0; i < 10; i++){
      int num = input.nextInt();
      list.add(i, num);
    }
    removeDuplicate(list);
  }
  public static void removeDuplicate(ArrayList<Integer> list){
    LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
    set.addAll(list);
    list.clear();
    list.addAll(set);
    System.out.println(list);
  }
}
//silvs code