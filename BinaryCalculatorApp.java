import java.util.Scanner;
public class BinaryCalculatorApp {
static Scanner userinput = new Scanner(System.in);
public static void main(String[] args) {

    String x;
    String y;
    //In this case r is short for result.
    String r;
    //I chose the names xi and yi to signify the these variables will be the integer equivalents of x and y.
    int xi;
    int yi;

    //Get the first binary number from the user and convert it to an int:
    System.out.print("Enter a number in Binary --> ");
    x = userinput.nextLine();
    xi = Integer.parseInt(x,2);

    //Get the second binary number from the user and convert it to an int:
    System.out.print("Enter another number in binary --> ");
    y = userinput.nextLine();
    yi = Integer.parseInt(y,2);

    System.out.print("\n");

    //Printing the binary numbers to the screen so the user can verify:
    System.out.println("x = "+x);
    System.out.println("y = "+y);

    //Performing the calculations on the integers, converting them back to binary strings, then printing the results to the screen:
    r = Integer.toBinaryString(xi+yi);
    System.out.println("The sum of the two binary numbers is: "+r);

    r = Integer.toBinaryString(xi-yi);
    System.out.println("The difference between the two binary numbers is: "+r);

    r = Integer.toBinaryString(xi*yi);
    System.out.println("The product of the two binary numbers is: "+r);

    r = Integer.toBinaryString(xi/yi);
    System.out.println("The quotient of the two binary numbers is: "+r);
}}
