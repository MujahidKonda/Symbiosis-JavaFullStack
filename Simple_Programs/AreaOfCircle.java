import java.util.*;

class areaofcircle {
    public static void main(String cp[]){
        System.out.print("Enter the Radius of circle:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.141 * r * r ;
        System.out.print("\nThe Area of circle = " +area);
        sc.close();

    }
}