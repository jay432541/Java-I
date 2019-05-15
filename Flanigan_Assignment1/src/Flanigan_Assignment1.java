/*Flanigan, Jesse
  INFO 1521 WW
  Spring Quarter 2019
  Flanigan_Assignment1.java
  *3/15/2019
 */

/**
 *
 * @author Jesse
 */
import java.util.Scanner;

class Flanigan_Assignment1 {

    /**
     * @param args the command line arguments
     */
     public static void main (String args[]) {
        double initialTemp = 0.0;
        double finalTemp = 0.0;
       
        Scanner sc = new Scanner(System.in);
                       
        System.out.println("Please enter the initial Fahrenheit temperature");
        initialTemp = sc.nextDouble();
        
        finalTemp = (initialTemp-32) * 5/9;
            System.out.println ("You entered " + initialTemp + " degrees "
                    + "Fahrenheit.");
            System.out.println("The converted temperature is " + finalTemp +
            " degrees Celsius.");
        }      
             
    }   