package classprograms;

import java.util.ArrayList;
import java.util.Scanner;
class p55{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList li = new ArrayList<>();

        for(int i=0; i<5; i++){
            System.out.println("Enter Elements: ");
            int temp=sc.nextInt();

            if( !li.contains(temp)){
                li.add(temp);
            }

         }
        System.out.print(li);

    }
}
