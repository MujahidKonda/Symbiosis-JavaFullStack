package classprograms;

import java.util.Scanner;
    
class MyFirstJavaProgram {
    static int a,b,c;
    void first()
    {
        System.out.print("The Sum of a and b is: "+c);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter a :");
      a = sc.nextInt();
      System.out.print("Enter b :");
      b = sc.nextInt();
      c = a+b;
      MyFirstJavaProgram obj = new MyFirstJavaProgram();
      obj.first();
      sc.close();
   
   }
   
}

