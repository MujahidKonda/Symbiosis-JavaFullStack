import java.util.Scanner;

class factorialofgivennumber {
   public static void main(String[] cp) {
      System.out.print("Enter the number :");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int fact = 1;

      for(int i = 1; i <= num; i++) {
         fact *= i;
      }

      System.out.print("Factorial of " + num + " is " + fact);
      sc.close();
   }
}