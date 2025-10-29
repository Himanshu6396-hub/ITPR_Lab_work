import java.util.Scanner; //import scanner class for user input

public class SumOfNumber {

    //  Method for calculating sum
    static float calculateSum(float a, float b) {
        return a + b;
    }
    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating object of Scanner class 

        System.out.print("Enter first integer number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = sc.nextFloat();

        // Directly call static method (no object needed)
        float sum = calculateSum(num1, num2);//Calling calculateSum method 

        System.out.println("Sum: " + sum);//Displaying sum of numbers

        sc.close(); // Close Scanner
    }
}
