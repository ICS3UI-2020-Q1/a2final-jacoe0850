import java.util.Scanner;
/**
 * Will calculate cost of pizza based of diameter
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is the size of the pizza (in cm):");
    double diam = input.nextDouble();
    double labour = 0.75;
    double power = 0.99;
    double ingredients = diam*0.50;
    double subtotal = labour+power+ingredients;
    double tax = subtotal*.13;
    double total = subtotal+tax;
    if (diam <= 19.99){
      System.out.println("Subtotal: $" + subtotal + 
      " Taxes: $" + tax + 
      " Total: $" + total);
      } else if (diam >= 20 && diam <=39.99){
      System.out.println("Subtotal: $" + subtotal + 
      " Taxes: $" + tax + 
      " Total: $" + total);
      } else if (diam > 40){
      System.out.println("Subtotal: $" + subtotal +  
      "Taxes: $" + tax + 
      "Total: $" + total);

  }
}
}
