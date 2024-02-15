import java.util.*;

class simpleinterest{
    public static void main(String cp[]){
        System.out.print("Enter the Principal Amount : ");
        Scanner sc = new Scanner(System.in);
        int pa = sc.nextInt();
        System.out.print("\nEnter the Aunnual Interest Rate : ");
        int ir = sc.nextInt();
        System.out.print("\nEnter the Time (in years) : ");
        int t = sc.nextInt();
        int ia = pa * ir * t /100;
        System.out.print("\nThe Interest Amount : " +ia );
        int fa = ia + pa;
        System.out.print("\nThe Final Amount : " +fa );
        
        sc.close();
    }
}