import java.util.Scanner;

class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ALL THE UNITS ARE IN CENTIMETER\n");
        System.out.print("\nenter the width: ");
        int w = sc.nextInt();
        System.out.print("\nenter the length: ");
        int l = sc.nextInt();
        int area = w*l;
        System.out.print("\nArea of Rectangle is :"+area);
        sc.close();
    }
}
