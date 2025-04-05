import java.util.Scanner; // Import Scanner class

public class Calculator {
    public static void main(String[] args) {
        float first;
        float second;
        Scanner sc = new Scanner(System.in); // Initialize Scanner

        System.out.println("\n***************** CALCULATOR ******************");
        System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiply \n 4. Divide");
        System.out.print("What You Want to Do? : ");
        
        int take_input = sc.nextInt();

        switch (take_input) {
            case 1:
                System.out.println("You Selected Addition ");
                System.out.print("Enter First Number : ");
                first = sc.nextFloat();
                System.out.print("Enter Second Number : ");
                second = sc.nextFloat();
                System.out.println("The Sum of " + first + " and " + second + " is " + (first + second));
                break;
            case 2:
                System.out.println("You Selected Subtraction ");
                System.out.print("Enter First Number : ");
                first = sc.nextFloat();
                System.out.print("Enter Second Number : ");
                second = sc.nextFloat();
                System.out.println("The Subtraction of " + first + " and " + second + " is " + (first - second));
                break;
            case 3:
                System.out.println("You Selected Multiplication ");
                System.out.print("Enter First Number : ");
                first = sc.nextFloat();
                System.out.print("Enter Second Number : ");
                second = sc.nextFloat();
                System.out.println("The Multiplication of " + first + " and " + second + " is " + (first * second));
                break;
            case 4:
                System.out.println("You Selected Division ");
                System.out.print("Enter First Number : ");
                first = sc.nextFloat();
                System.out.print("Enter Second Number : ");
                second = sc.nextFloat();
                if (second == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("The division of " + first + " and " + second + " is " + (first / second));
                }
                break;
            default:
                System.out.println("Oops! Something went wrong. Please try again.");
                break;
        }

        sc.close(); // Close Scanner
    }
}
