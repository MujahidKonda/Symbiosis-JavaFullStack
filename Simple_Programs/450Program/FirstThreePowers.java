import java.util.Scanner;

class firstthreepowers {

    public static void main(String[] cp) {
       System.out.print("Enter the integer: ");
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       System.out.println("Integer to power 1 : " + i);
       System.out.println("Integer to power 2 : " + i * i);
       System.out.println("Integer to power 3 : " + i * i * i);
       sc.close();
    }
 }