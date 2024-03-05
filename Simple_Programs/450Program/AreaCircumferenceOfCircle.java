import java.util.*;

class areacircumferenceofcircle {
    public static void main(String cp[]){
        System.out.print("Enter the Radius of circle:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r ;
        double circumference = 2 * Math.PI * r ;
        System.out.print("\nThe Area of circle = " +area);
        System.out.print("\nThe Circumference of circle = " +circumference);
        sc.close();

    }
}
