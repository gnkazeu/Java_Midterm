import java.util.Scanner;

class ScientificCalculator extends Calculator {

    public ScientificCalculator(float a, float b, String c) {
        super(a, b, c); //constructor stub
      }
      void select_operation(){
        if ("+".equals(op)) {
          Addition();
            
        } else if ("-".equals(op)) {
          Substraction();
          
        } else if ("*".equals(op)) {
          Multiplication();
        }
        else if ("^2".equals(op)) {
            squareNAddTwoNumbers();
        } 
        else if ("^3".equals(op)) {
            cubeNAddTwoNumbers();
        }         
        else if ("/".equals(op)) {
            Division();
          } else {
            System.out.println("Not a valid Operation");
          }
      }
    void squareNAddTwoNumbers() {
        float result = (float) (Math.pow(nbr1, 2)  + Math.pow(nbr2, 2)) ;
        System.out.println("Squared addition of two numbers is: " + result); 
    
      }
    void cubeNAddTwoNumbers() {
        float result = (float) (Math.pow(nbr1, 3)  + Math.pow(nbr2, 3)); 
        System.out.println("Cubed addition of two numbers is: " + result); 
      }
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter nbr1");
    float nbr1 = myObj.nextFloat();  // Read user input 1

    System.out.println("Enter nbr2");
    float nbr2 = myObj.nextFloat();  // Read user input 2
    System.out.println("Enter  valid operator:");
    String op = myObj.next();  // Read user input 3

    myObj.close();
    ScientificCalculator my_calc = new ScientificCalculator (nbr1, nbr2, op);
    my_calc.select_operation();
  
  }
}
