//Calculate grades of student

package Assignments.Assignment1;

import java.util.Scanner;

class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of the Student out of 100 : ");
        int mark = sc.nextInt();
        if(mark > 100){
            System.out.println("Enter valid marks");
        }
        else if(mark<100 && mark>90){
            System.out.println("CONGRATULATIONS!!!");
            System.out.print("You got A Grade");
        }
        else if(mark<90 && mark>80){
            System.out.println("Good!!!");
            System.out.print("You got B Grade");
        }
        else if(mark<80 && mark>70){
            System.out.println("Average!!!");
            System.out.print("You got C Grade");
        }
        else if(mark<70 && mark>60){
            System.out.println("Can do better!!!");
            System.out.print("You got D Grade");
        }
        else if(mark<60 && mark>40){
            System.out.println("Better luck next time!!!");
            System.out.print("You got E Grade");
        }
        else{
            System.out.println("Better luck next time!!!");
            System.out.print("You got F Grade");
        }
        sc.close();
    }
}
