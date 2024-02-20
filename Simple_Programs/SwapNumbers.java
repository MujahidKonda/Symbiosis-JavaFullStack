import java.util.*;

class swapnumbers{
	public static void main(String cp[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Num1 :");
		int num1 = sc.nextInt();
		System.out.print("Enter Num2 :");
		int num2 = sc.nextInt();
		int nul = 0;
		System.out.print("Numbers Before Swap: \nnum1 = " +num1+ "\nnum2 = " +num2);
		nul = num1;
		num1 = num2;
		num2 = nul;
		System.out.print("\nNumbers After Swap: \nnum1 = " +num1+ "\nnum2 = " +num2);
		sc.close();
	}
}