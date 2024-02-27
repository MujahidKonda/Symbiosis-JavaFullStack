package classprograms;

class p15 {
    void add(int a, int b) {
        System.out.print("Adding 2 numbers ");
        int c = a+b;
        System.out.print(c);
    }

    void add(float a, float b) {
        System.out.print("\nAdding 2 numbers ");
        float c = a+b;
        System.out.print(c);
    }

    public static void main(String Args[]) {
        p15 obj = new p15();
        obj.add(10,20);
        obj.add(10.5f,20.5f);
    }
}
