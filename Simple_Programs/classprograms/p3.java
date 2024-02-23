package classprograms;

import java.util.Scanner;

class add{
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b= sc.nextInt();
        System.out.printf("Sum is = %d", a+b );
        sc.close();
    }
}

class p3 {
    public static void  main(String[] args){
        add a = new add();
        a.sum();
    }
}
