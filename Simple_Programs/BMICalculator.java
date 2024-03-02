import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height in feet : ");
        float feet = sc.nextFloat();
        float inches = feet*12;
        System.out.print("Enter Weight in Kilogram : ");
        float kilogram = sc.nextFloat();
        float pounds = kilogram*2.205f;
        float bmi = (float) (pounds / Math.pow(inches,2)*703);
        System.out.print("Your BMI Value is "+bmi);
        sc.close();

    }
}
