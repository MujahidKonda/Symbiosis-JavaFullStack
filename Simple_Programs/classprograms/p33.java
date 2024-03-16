package classprograms;
import java.util.Scanner;

class p33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number : ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        float avg = sum/arr.length;
        System.out.println("\nAverage of numbers : "+avg);
        sc.close();
    }
}

