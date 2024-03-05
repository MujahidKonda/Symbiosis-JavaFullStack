import java.util.Scanner;

class TernaryOperator5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter Thrid number : ");
        int c = sc.nextInt();
        
        //int largest = (( a > b && a > c)? a: (b > c)? b : c);
        //System.out.print("\nThe larger number is "+largest);

        if( a > b){
            int largest = (a > c)? a : c;
            System.out.print("\nThe larger number is "+largest);
        }
        else{
            int largest = (b > c)? b : c ;
            System.out.print("\nThe larger number is "+largest);
        }
        sc.close();
    }
}
