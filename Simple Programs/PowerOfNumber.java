//Power Of Number

import java.util.*;
import java.lang.Math;

class powerofnumber{
	public static void main(String cp[]){
		System.out.print("Enter the Base Number:");
		Scanner sc = new Scanner(System.in);
		double b = sc.nextDouble();
		System.out.print("\nEnter the Power:");
		double n = sc.nextDouble();
		double p = Math.pow(b,n);
		System.out.print("\nPower of Number = " +p);
		sc.close();
	}
}