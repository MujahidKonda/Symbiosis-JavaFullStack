//Calculate Compound Interest


import java.util.*;

class CompoundInterest {
    public static void main(String[] args) {
        System.out.print("Enter Principal Amount: ");
        Scanner s = new Scanner(System.in);
        double principal = s.nextDouble();
        System.out.print("\nEnter Rate of Interest Per Annum: ");
        double rate = s.nextDouble();
        System.out.print("\nEnter time period in years: ");
        double time = s.nextDouble();
        System.out.print("\nEnter number of times the interest is compounded annually: ");
        int n = s.nextInt();
        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);
        double ci = amount - principal;
        System.out.print("\nCompound Interest = " + ci);
        s.close();
    }
}