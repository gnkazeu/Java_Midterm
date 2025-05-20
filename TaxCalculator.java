import java.util.Scanner;

class TaxCalculator extends Calculator {

    public TaxCalculator(float a, float b, String c) {
        super(a, b, c);
    }
      void select_operation(){
        if ("+".equals(op)) {
            if (isInteger(nbr1) && isInteger(nbr2)) {
                Addition((int) nbr1, (int) nbr2, op);
            } else {
                Addition(nbr1, nbr2, op);
            }   
        } else if ("-".equals(op)) {
          Substraction();
          
        } else if ("*".equals(op)) {
          Multiplication();
        }       
        else if ("/".equals(op)) {
            Division();
          } else {
            System.out.println("Not a valid Operation");
          }
      }
    void Addition(int a, int b , String c) {
        float result = (float) ((nbr1 + nbr2) * 1.13);
        System.out.println("Addition result is: " + result); 
    }
    boolean isInteger(float number) {
        return number == Math.floor(number);
    }
    void Addition(float a, float b , String c) {
        float result =  nbr1 + nbr2;
        System.out.println("Addition result is: " + result); 
    }
    void Substraction() {
        float result = (float) ((nbr1 - nbr2) * 1.13);
        System.out.println("Substraction result is: " + result); 

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
    TaxCalculator my_calc = new TaxCalculator (nbr1, nbr2, op);
    my_calc.select_operation();
  
  }
    
}
