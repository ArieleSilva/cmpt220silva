/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 6
 */
 public class Rectangle {
  public static void main(String[] args){
    Rectangle Rectangle1 = new Rectangle(); 
    System.out.println("The area of the rectangle is: " + Rectangle1.getArea());
    System.out.println("The perimeter of the rectangle is: " + Rectangle1.getPerimeter());
  }
  double height = 1;
  double width = 1;
  Rectangle(){
    this.height = 2;
    this.width = 4;
  }
  Rectangle(int width, int height){
    this.width = width;
    this.height = height;
  }
  double getArea(){
    return this.height * this.width;
  }
  double getPerimeter(){
    return 2 * height * width;

  }
}
//silvs code