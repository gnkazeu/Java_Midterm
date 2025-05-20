import java.util.Scanner;

public class Calculator {
  protected float  nbr1;
  protected float  nbr2;
  protected String op;

  public Calculator(float a, float b, String c) {
    nbr1 = a;
    nbr2 = b;
    op = c;
  }
  

  void select_operation(){
    if ("+".equals(op)) {
      Addition();
        
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
    void Addition() {
    float result = nbr1 + nbr2;
    System.out.println("Addition result is: " + result); 

  }
   void Substraction() {
    float result = nbr1 - nbr2;
    System.out.println("Substraction result is: " + result); 
  }
   void Multiplication() {
    float result = nbr1 * nbr2;
    System.out.println("Multiplication result is: " + result); 

  }
   void Division() {
    if (nbr2 == 0){
      System.out.println(" Can not divide by zero");
    }else{
      float result = nbr1 / nbr2;
      System.out.println("Division result is: " + result); 
    }

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
    Calculator my_calc = new Calculator (nbr1, nbr2, op); // Create object
    my_calc.select_operation();
  }
}
    

