package classprograms;

import java.util.Scanner;

class p7 {
    int rollno;
    String name;
    static String college = "Sinhgad";

    void getdata(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.print(rollno+" "+name+" "+college+"\n");
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no. :");
        int r1 = sc.nextInt();
        System.out.print("Enter Name :");
        String n1 = sc.next();
        p7 s1 = new p7();
        System.out.print("Enter Roll no. :");
        int r2 = sc.nextInt();
        System.out.print("Enter Name :");
        String n2 = sc.next();
        p7 s2 = new p7();
        System.out.print("Enter Roll no. :");
        int r3 = sc.nextInt();
        System.out.print("Enter Name :");
        String n3 = sc.next();
        p7 s3 = new p7();
        s1.getdata(r1,n1);
        s2.getdata(r2,n2);
        s3.getdata(r3,n3);
        s1.display();
        s2.display();
        s3.display();
        sc.close();

    }
}
