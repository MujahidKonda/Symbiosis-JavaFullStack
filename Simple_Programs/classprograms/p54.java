package classprograms;
import java.util.Scanner;


class p54 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrsize = 5;
        int[] arr = new int[arrsize];
        System.out.println("Enter the Elements of Array:");
        for(int j = 0; j < arrsize; j++ ){
            if(sc.hasNextLine()){
                arr[j] = sc.nextInt();
            }
        }
        

        sc.close();

    }
}
