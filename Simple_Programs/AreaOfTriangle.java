import java.util.*;

class AreaOfTriangle {
    public static void main(String cp[]){
        System.out.print( "Enter Base Value : ");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        System.out.print( "Enter Height Value : ");
        double h = sc.nextDouble();
        Double area = 0.5 * b * h ;
        System.out.print("Area of Triangle = " +area);
        sc.close();
    }
    
}
