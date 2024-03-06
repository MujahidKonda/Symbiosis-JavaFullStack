import java.util.Scanner;

class TernaryOperator4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        sc.close();

        if( a == b){
            System.out.print("Both are equal");
        }
        else{
            int largest = (a > b)? a : b ;
            System.out.print("\nThe larger number is "+largest);
        }
    }
}
