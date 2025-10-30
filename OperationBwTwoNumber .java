import java.util.Scanner;

// Class to perform basic operations between two numbers using switch-case
public class OperationBwTwoNumber {

    // Instance variables to store two numbers
    float num1, num2;

    // Constructor calling 
    public OperationBwTwoNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :- ");
        num1 = sc.nextFloat();
        System.out.println("Enter Second number :- ");
        num2 = sc.nextFloat();
    }

    // Method to display the entered numbers
    private void display() {
        System.out.println("First number is " + num1);
        System.out.println("Second number is " + num2);
    }

    // Method to perform addition
    void addition() {
        System.out.println("The Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }

    // Method to calculate and display the absolute difference
    void difference() {
        float diff = Math.abs(num1 - num2);
        System.out.println("The Difference between " + num1 + " and " + num2 + " is " + diff);
    }

    // Method to calculate and display the product
    void product() {
        System.out.println("The Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
    }

    // Method to display a menu and perform the selected operation using switch-case
    private void operations() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ Select Operation ------");
        System.out.println("1. Addition");
        System.out.println("2. Difference");
        System.out.println("3. Product");
        System.out.println("4. Exit");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // Performing operation based on user choice
        switch (choice) {
            case 1:
                addition();
                break;
            case 2:
                difference();
                break;
            case 3:
                product();
                break;
            case 4:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }
    }

    // Main method — execution starts here
    public static void main(String[] args) {
        OperationBwTwonumber obj = new OperationBwTwonumber(); // Creating object
    
        obj.display();     // Display input numbers
        obj.operations();  // Ask user to choose and perform operation
    }
}
