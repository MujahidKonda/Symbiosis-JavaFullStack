package classprograms;

import java.util.Scanner;

class evenodd{
    public void eo(){
        System.out.print("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if( input != 0){
            if( input%2 == 0 ){
                System.out.print("The Number is Even");
            }
            else{
                System.out.print("The Number is Odd");
            }
        }
        else{
            System.out.print("The Number is Neutral");
        }
        sc.close();
    }
}

class p4 {
    public static void main(String[] args){
        evenodd x = new evenodd();
        x.eo();
    }
}
