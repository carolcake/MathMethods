/* Caroline Hsu - 10/27/2020
This program prompts the user to enter an angle in degrees and will display it
in radians and take the sine of that angle. Then, it will prompt the user to 
enter a different positive integer to take the square root of it. Next, it 
will prompt the user to enter 2 integers and display the power. After, it will
take the floor and ceiling of a decimal number entered and display it. Finally,
it will prompt the user for a lower and upper bound and it will display a 
random number between the lower and upper bound and display it.
*/
package mathmethods;
// import Scanner from API
import java.util.Scanner;
public class MathMethods
{
  public static void main(String[] args)
  {
    // declare variables and declare a variable of type Scanner
    Scanner kb = new Scanner(System.in);
    int degrees;
    double radians;
    double sineAngle;
    int negativeBoundary = 0;
    int integer;
    double squareRoot;
    int m;
    int n;
    double power;
    long round;
    double decimal;
    double floor;
    double ceiling;
    int L;
    int U;
    final int formula = 1;
    double result;
    
    /* Prompt the user to enter an angle in degrees, calculate it in radians,
    and use the radian value to find the sine of the angle and it will display 
    the answer */
    System.out.print("Please enter an angle in degrees: ");
    degrees = kb.nextInt();
    radians = Math.toRadians(degrees);
    System.out.printf("Your angle in radians is: %6.4f \n" , radians);
    sineAngle = Math.sin(radians);
    System.out.printf("The sine of your angle is: %6.4f \n" , sineAngle);
    
    // prompt the user to enter a positive integer, and if not, run a loop
    System.out.print("Please enter a positive integer: ");
    integer = kb.nextInt();
    // while loop for if the integer is negative, it will keep prompting the
    // user to enter a positive integer until they input a positive integer
    while(integer < negativeBoundary)
    {
      System.out.print("Please enter a positive integer: ");
      integer = kb.nextInt();
    }
    // it will take the square root of the positive integer and display it
    squareRoot = Math.sqrt(integer);
    System.out.printf("The square root of the positive integer you have " +
                        "inputed is: %6.4f \n" , squareRoot);
    
    /* prompt the user to enter two integers m and n for the base and exponent
    and it will calculate m^n power and display it for the user */
    System.out.print("Please enter an integer m for the base of the power: ");
    m = kb.nextInt();
    kb.nextLine();
    System.out.print("Please enter an integer n for the exponent of the " + 
                      "power: ");
    n = kb.nextInt();
    kb.nextLine();
    power = Math.pow(m, n);
    System.out.println("The answer for power m^n is: " + power);
    
    /* prompt the user to enter a decimal number and round the number, find the 
    floor and ceiling of the number, and display it for the user */
    System.out.print("Please enter a decimal number: ");
    decimal = kb.nextDouble();
    round = Math.round(decimal);
    floor = Math.floor(decimal);
    ceiling = Math.ceil(decimal);
    System.out.println("Your decimal number rounded is: " + round);
    System.out.println("The floor of the decimal number " + decimal + 
                       " is " + floor);
    System.out.println("The celing of the decimal number " + decimal + 
                       " is " + ceiling);
    
    // prompt the user to enter a lower and upper bound and find a random
    // number between the lower and upper bound and display it for the user
    System.out.print("Please enter an integer lower bound: ");
    L = kb.nextInt();
    kb.nextLine();
    System.out.print("Please enter an integer upper bound: ");
    U = kb.nextInt();
    kb.nextLine();
    result = L + (int)(Math.random() * (U - L + formula));
    System.out.println("A random number between your lower and upper bound " + 
                        "is: " + (int) result);
  }
}