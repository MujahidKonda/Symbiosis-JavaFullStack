package classprograms;

import java.util.Scanner;

class input{
    int a;
    void getdata( int i){
        a = i;
    }
    void putdata(){
        int reverse = 0;
        while(a != 0)
        {  
        int remainder = a % 10;  
        reverse = reverse * 10 + remainder;  
        a = a/10;  
        }
        System.out.println("The entered Reverse number is : "+reverse);
    }
}


class p5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m;
        input b = new input();
        System.out.print("Enter a number :");
        m = sc.nextInt();
        b.getdata(m);
        b.putdata();
        sc.close();
    }
    
}
