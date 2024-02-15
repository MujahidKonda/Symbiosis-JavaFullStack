import java.util.*;

class AsciiValue {
    public static void main(String cp[]){
        System.out.print("Enter a Character:");
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        System.out.println("Ascii Value of Character :" +a);
        sc.close();
    }
    
}
