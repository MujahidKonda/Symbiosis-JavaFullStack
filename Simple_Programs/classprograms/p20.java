package classprograms;

import java.util.Scanner;

class p20 {
    int a,b;
    void get(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the value of a = ");
        a =  sc.nextInt();

        System.out.print("\nEnter the value of b = ");
        b =  sc.nextInt();
       
    }

    void disp(){
        System.out.print("\nAddition of a and b = "+(a+b));
    }
}

class addition extends p20 {
    
    int c;
    void get2(){
        Scanner sc = new Scanner(System.in);
    
        System.out.print("\nEnter the value of c = ");
        c =  sc.nextInt();
        sc.close();

    }

    void display(){
        System.out.print("\nAddition of a, b and c = "+(a+b+c));
    }

    public static void main(String[] args){
        addition ad = new addition();
        ad.get();
        ad.get2();
        ad.disp();
        ad.display();
    }
}
