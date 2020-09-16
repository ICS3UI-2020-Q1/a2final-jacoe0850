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
    // Asking for the diameter of the pizza
    System.out.println("What is the size of the pizza (in cm):");
    // Creating variable for the diameter that they tell you
    double diam = input.nextDouble();
    // variables for the two costs that never change
    double labour = 0.75;
    double power = 0.99;
    // variables for all the numbers with calculations
    double ingredients = diam*0.50;
    double subtotal = labour+power+ingredients;
    double tax = subtotal*.13;
    double total = subtotal+tax;
    // if statements telling all the costs and correct final message
    if (diam <= 19.99){
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Taxes: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("We are going to make you a cute little pizza!");
      } else if (diam >= 20 && diam <=39.99){
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Taxes: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("This will be delicious!");
      } else if (diam > 40){
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Taxes: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Whoa, big pizza! You might need a truck to get this home!");


  }
}
}
