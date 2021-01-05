 
import java.rmi.Naming; 
import java.rmi.RemoteException; 
import java.net.MalformedURLException; 
import java.rmi.NotBoundException; 
import java.util.Scanner;  // Import the Scanner class
 
public class CalculatorClient { 
 
    public static void main(String[] args) { 
        try { 
 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number:");

        float a = myObj.nextFloat();  // Read user input
        System.out.println("first is: " +a);  // Output user input

    System.out.println("Enter sec number:");
float b = myObj.nextFloat();  // Read user input
    System.out.println("second is: " +b);  // Output user input

            Calculator c = (Calculator)
                           Naming.lookup(
                 "rmi://localhost/CalculatorService");
 
            System.out.println( c.sub(a, b) ); 
            System.out.println( c.add(a, b) ); 
            System.out.println( c.mul(a, b) ); 
            System.out.println( c.div(a, b) ); 
        } 
        catch (MalformedURLException murle) { 
            System.out.println(); 
            System.out.println(
              "MalformedURLException"); 
            System.out.println(murle); 
        } 
        catch (RemoteException re) { 
            System.out.println(); 
            System.out.println(
                        "RemoteException"); 
            System.out.println(re); 
        } 
        catch (NotBoundException nbe) { 
            System.out.println(); 
            System.out.println(
                       "NotBoundException"); 
            System.out.println(nbe); 
        } 
        catch (
            java.lang.ArithmeticException
                                      ae) { 
            System.out.println(); 
            System.out.println(
             "java.lang.ArithmeticException"); 
            System.out.println(ae); 
        } 
    } 
} 
