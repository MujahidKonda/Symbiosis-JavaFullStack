//Calculate the power of a given number.

package Assignments.Assignment1;

import java.util.Scanner;

class ex2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Base Number: ");
        int base = sc.nextInt();
        System.out.println("Enter Power: ");
        int power = sc.nextInt();
        double abc = 1;
        for(int i = 1; i<=power; i++){
             abc = abc*base;
        }
        System.out.println(""+abc);
        sc.close();
    }
}
