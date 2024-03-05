package classprograms;

class p22 {
    public static void message(){
        System.out.print("Hello i am learning how to create void function in java.");
    }

    public static void sum(int a, int b){
        int c;
        c = a+b;
        System.out.print("\nSum of "+a+" and "+b+" = "+c);
    }

    public static void main(String[] args){
        message();
        sum( 10, 20);
    }
}
