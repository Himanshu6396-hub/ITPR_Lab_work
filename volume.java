import java.util.*;
class Volume{
// Volume of Cube
    void volume(double side) {
        double v = side * side * side;
        System.out.println("Volume of Cube = " + v);
    }
// Volume of Cuboid
    void volume(double length, double breadth, double height) {
        double v = length * breadth * height;
        System.out.println("Volume of Cuboid = " + v);
    }
// Volume of Cylinder
    void volume(double radius, double height, int x) {
        double v = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder = " + v);
    }
// Volume of Cone
    void volume(double radius, double height) {
        double v = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone = " + v);
    }
// Volume of Sphere
    void volume(int radius) {
        double v = (4.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Sphere = " + v);
    }
// Volume of Sphere
    void volume(int radius) {
        double v = (2.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere = " + v);
    }
// main method 
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Volume obj = new Volume();
 System.out.println("1. Cube");
        System.out.println("2. Cuboid");
        System.out.println("3. Cylinder");
        System.out.println("4. Cone");
        System.out.println("5. Sphere");
        System.out.println("6. Hemisphere");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
switch (choice) {

            case 1:
                System.out.print("Enter side: ");
                obj.volume(sc.nextDouble());
                break;

            case 2:
                System.out.print("Enter length, breadth, height: ");
                obj.volume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;

            case 3:
                System.out.print("Enter radius and height: ");
                obj.volume(sc.nextDouble(), sc.nextDouble(), 1);
                break;

            case 4:
                System.out.print("Enter radius and height: ");
                obj.volume(sc.nextFloat(), sc.nextFloat());
                break;

            case 5:
                System.out.print("Enter radius: ");
                obj.volume(sc.nextInt());
                break;

            case 6:
                System.out.print("Enter radius: ");
                obj.volume(sc.nextInt(), 1);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}