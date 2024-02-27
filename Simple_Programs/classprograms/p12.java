package classprograms;

import java.util.Scanner;

class p12 {
    int a;
    int b;
    int r;

    p12(int x, int y){
        a = x;
        b = y;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        b = sc.nextInt();
        sc.close();
    }

    void result(){
        r = a - b;
    }

    void display(){
        System.out.print(a);
        System.out.print("-"+b);
        System.out.print("="+r);
    }

    public static void main(String args[]){
        p12 s = new p12(30,20);
        s.input();
        s.result();
        s.display();
    }
}
