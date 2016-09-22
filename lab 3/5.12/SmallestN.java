/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 3
 */
public class SmallestN {
	public static void main(String[] args){
		boolean numberfound = true;
		int small = 1;  
		while(numberfound != false){
		  if (small * small > 12000){
		    numberfound = false;
		  }
		  else{
		    small++;
		  }
		}
		System.out.println(small);
	}
}
//silvs code