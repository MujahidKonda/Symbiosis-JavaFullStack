import java.util.Scanner;

class fibonacciseries {
   public static void main(String[] cp) {
      Scanner sc = new Scanner(System.in);
      int a = 0;
      int b = 1;
      System.out.print("Enter the count of Fibonacci Series :");
      int count = sc.nextInt();

      System.out.print(" "+a+" "+b);

      for(int i = 2; i < count; ++i) {
         int c = a + b;
         System.out.print(" " + c);
         a = b;
         b = c;
         sc.close();
      }

    }

}
