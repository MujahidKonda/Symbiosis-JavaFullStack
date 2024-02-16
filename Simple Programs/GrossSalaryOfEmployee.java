import java.util.*;


class GrossSalaryOfEmployee {
    public static void main(String cp[]){
        System.out.print("Enter Employee's Basic Salary : ");
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        int hra = bs / 2;
        int ta = 500;
        int gs = bs + hra + ta;
        System.out.print("Gross Salary of the Employee = " +gs);
        sc.close();

    }
}
