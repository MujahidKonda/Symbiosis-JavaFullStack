import java.util.*;

class ConverttoAbbrevated {
    public static void main(String cp[]){
        System.out.print("Enter Your Name :");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);
        System.out.println("\nAbbreviated Name :" +a+b);
        sc.close();
    }
}
