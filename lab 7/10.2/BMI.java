/* Ariele Silva
 * Cmpt 220
 * Prof. Rivas
 * Lab 7
 */
public class BMI {
  private String name;
  private int age;
  private double weight;
  private double height;
  public static final double KILOGRAMS_PER_POUND = 0.45359237;
  public static final double METERS_PER_INCH = 0.0254;

  public BMI(String name, int age, double weight, double height) {
    this.name = name;
    this.weight = weight;
    this.height = height;
  }
  public BMI(String name, double weight, double height) {
    this(name, 20, weight, height);    
  }
  public BMI(String name, int age, double weight, double feet,
      double inches){
    feet = feet * 12;
    double height = feet + inches; 
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public double getBMI() {
    double bmi = weight * KILOGRAMS_PER_POUND /
        ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
    return Math.round(bmi * 100) / 100.0;
  }
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "underweight";
    else if (bmi < 25)
      return "normal";
    else if (bmi < 30)
      return "overweight";
    else
      return "obese";
  }

  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public double getWeight(){
    return weight;
  }
  public double getHeight(){
    return height;
  }
}
//silvscode