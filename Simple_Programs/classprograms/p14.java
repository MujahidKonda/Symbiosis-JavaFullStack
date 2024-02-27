package classprograms;

class p14 {
    int add(int a, int b) {
        System.out.print("Adding 2 numbers ");
        return a + b;
    }

    void add(float a, float b) {
        System.out.print("Adding 2 numbers ");
    }

    public static void main(String Args[]) {
        p13 obj = new p13();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10.5f, 20.5f));
    }
}
