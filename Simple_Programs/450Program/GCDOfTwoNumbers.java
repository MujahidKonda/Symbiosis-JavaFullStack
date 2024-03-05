import java.util.Scanner;

class gcdoftwonumbers{
    public static void main(String[] cp){
        System.out.print("Enter Number 1 :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int b = sc.nextInt();
        int gcd = 1;
        for (int i = 1;i<=a && i<=b; i++){
            if(a%i==0 && b%i==0)
            gcd = i;
        }

        System.out.printf("GCD of %d and %d is %d",a,b,gcd);
        sc.close();
    }
}