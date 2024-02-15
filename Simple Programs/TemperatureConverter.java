//Convert Temperature From Fahrenheit to Celcius

import java.util.*;

class temperature{
	public static void main(String cp[]){
		System.out.print( "temperature in Fahrenheit :");
		Scanner sc = new Scanner(System.in);
		float F = sc.nextInt();
		float C = ( F - 32 ) * 5/9 ;
		System.out.println("Temperature in Celcius is :" +C );
		sc.close();
	}
}