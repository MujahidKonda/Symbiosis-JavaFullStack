import java.util.Scanner;

class TernaryOperator3 {
    private static Scanner sc;
    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.print("Please Enter any Number to check whether it is divisible by 5 and 11: ");
        int number = sc.nextInt();

        if ((number % 5 == 0) && (number % 11 == 0)){
            System.out.println("\nGiven number " +number+ " is divisible by 5 and 11");
        }
        else{
            System.out.println("\nGiven number " +number+ " is not divisible by 5 and 11");
        }
        

        String message = ((number % 5 == 0) && (number % 11 == 0)) ? " is divisible by 5 and 11" :" is not divisible by 5 and 11";
        System.out.println("\nGiven number " +number+message);

    }
}
