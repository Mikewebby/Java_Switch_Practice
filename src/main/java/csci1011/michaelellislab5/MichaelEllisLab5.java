package csci1011.michaelellislab5;

import java.util.Scanner;

/**
 *
 * @author Michael Ellis
 */

 public class MichaelEllisLab5 {

    public static void main(String[] args) {        
       
        System.out.println("Choose one of the following options: ");
        System.out.println("1. Perform an arithmetic operation");
        System.out.println("2. Apply a function");
        System.out.println("3. Calculate a factorial");
        System.out.println("4. Exit the program");
        System.out.println();
        
        Scanner keyboard = new Scanner(System.in);
        Scanner secondKeyboard = new Scanner(System.in);
        int userInput = keyboard.nextInt();
        int firstNumber, secondNumber, number, result;
        String operation, func;
        double arg;
        
        do {
            switch (userInput) {
                case 1: System.out.println("Enter an arithmetic expression in the form of Num Op Num");
                		firstNumber = keyboard.nextInt();
                                operation = keyboard.next();
                		char operationChar = operation.charAt(0);
                		secondNumber = keyboard.nextInt();
                               
                
                		switch (operationChar){
                          case '+': System.out.println(firstNumber + secondNumber);
                          break;
                          case '-': System.out.println(firstNumber - secondNumber);
                          break;
                          case '*': System.out.println(firstNumber * secondNumber);
                          break;
                          case '/': System.out.println(firstNumber / secondNumber);
                          break;
                          case '%': System.out.println(firstNumber % secondNumber);
                          break;
                          default: System.out.println("You entered an unknown operator");
                            break;
                        }        
                 break;
                case 2: System.out.println("Enter an arithmetic expression in the form of Func Arg");
                       func = keyboard.next();
                       arg = keyboard.nextDouble();
                       
                       switch (func){
                           case "log": System.out.println(Math.log10(arg));
                           break;
                           case "ln": System.out.println(Math.log(arg));
                           break;
                           case "sqrt": System.out.println(Math.sqrt(arg));
                           break;
                           default: System.out.println("You entered an unknown function");
                           break;
                       }
                       
                break;
                case 3: System.out.println("Enter a number");
                number = keyboard.nextInt();
                result = 1;
                int i = 1;                
                while( i <= number){
                result = result * i;               
				i++;
                }
                System.out.println(result);    
                break;
                case 4: System.out.println("Thank you for using Michael "
                        + "Ellis's Calculator");
                System.exit(0);
                default: System.out.println("Invalid Choice");
                break;
            }
        } while(userInput < 4);
    }
}
