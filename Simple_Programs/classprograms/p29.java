package classprograms;

import java.util.Scanner;

interface area{
    double pi = 3.14;
    void cal(int x, int y);
}

class arearec implements area{
    public void cal(int x,int y){
        int a = x*y;
        System.out.println("Area of Rectangle : "+a);
    }
}

class areacir implements area{
    public void cal(int x,int y){
        double a = pi*x*x;
        System.out.println("Area of Circle : "+a);
    }
}

class p29{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Length of the Rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter Breadth of the Rectangle : ");
        int b = sc.nextInt();
        area obj = new arearec();
        obj.cal(l,b);

        System.out.println("Enter radius of the circle : ");
        int rad = sc.nextInt();
        area obj1 = new areacir();
        obj1.cal(rad,1);
        sc.close();

    }
}
