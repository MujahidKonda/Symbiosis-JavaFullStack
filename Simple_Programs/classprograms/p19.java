package classprograms;

import java.util.Scanner;

class p19 {
    public void sum(int a, int b, int c){
        System.out.print("Sum of two numbers :"+(a+b));
        System.out.print("\nSum of three numbers :"+(a+b+c));
    }
}

class inputs extends p19{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        inputs s = new inputs();

        System.out.print("Enter first number : ");
        int x = sc.nextInt();

        System.out.print("Enter Second number : ");
        int y = sc.nextInt();

        System.out.print("Enter third number : ");
        int z = sc.nextInt();

        s.sum(x,y,z);
        
        sc.close();
    }
}