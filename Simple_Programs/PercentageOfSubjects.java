import java.util.*;

class percentageofsubjects{
    public static void main(String cp[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Marks of subject 1 :");
        float s1 = input.nextFloat();
        System.out.print("Enter the Marks of subject 2 :");
        float s2 = input.nextFloat();
        System.out.print("Enter the Marks of subject 3 :");
        float s3 = input.nextFloat();
        System.out.print("Enter the Marks of subject 4 :");
        float s4 = input.nextFloat();
        System.out.print("Enter the Marks of subject 5 :");
        float s5 = input.nextFloat();

        float total = s1 + s2 + s3 + s4 + s5;
        float percentage = total/500*100;

        System.out.print("Total Marks = " +total+ " Out of 500");
        System.out.print("\nPercentage = " +percentage+ "%");
        input.close();
    }
}