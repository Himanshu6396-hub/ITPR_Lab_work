// Importing Scanner class to take input from the user
import java.util.Scanner;

// Class to calculate area and perimeter of a triangle
class AreaPerimeter {
    // Private variables to store the sides of the triangle
    private float a, b, c;

    // Constructor to initialize the sides when object is created
    public AreaPerimeter() {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        a = sc.nextFloat(); // Read side a from user

        System.out.print("Enter side b: ");
        b = sc.nextFloat(); // Read side b from user

        System.out.print("Enter side c: ");
        c = sc.nextFloat(); // Read side c from user
      // Close the Scanner to prevent resource leak
        sc.close();
    }
    // Method to display sides, perimeter, and area of the triangle
    void displayData() {
        System.out.println("Side a: " + a); // Print side a
        System.out.println("Side b: " + b); // Print side b
        System.out.println("Side c: " + c); // Print side c

        // Call perimeterCalculation() method and print the result
        System.out.println("Perimeter is: " + perimeterCalculation());

        // Call areaCalculation() method and print the result
        System.out.println("Area is: " + areaCalculation());
    }

    // Method to calculate perimeter of the triangle
    float perimeterCalculation() {
        return (a + b + c); // Perimeter = sum of all sides
    }

    // Method to calculate area using Heron's formula
    double areaCalculation() {
        float s = (a + b + c) / 2; // Calculate semi-perimeter
        // Return area using formula: sqrt(s*(s-a)*(s-b)*(s-c))
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

// Main class to run the program
public class TriangleOperation {
    public static void main(String[] args) {
        

        // Create AreaPerimeter object with entered sides
        AreaPerimeter obj = new AreaPerimeter();

        // Call displayData() method to show triangle info
        obj.displayData();

        
    }
}
