package classprograms;

class MyPrinter1{
    synchronized void printer(String s){
        for (int i = 1; i <= 10; i++) { 
            for (int j = 10; j >= i; j--) { 
                System.out.print(" "); 
            } 
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        }
        System.out.println();
    }
}

class MyThread1 extends Thread{
    String s;
    MyPrinter1 p;
    MyThread1(String s){
        this.s = s;
        p = new MyPrinter1();
    }

    public synchronized void run(){
        for(int ctr = 0; ctr < 50; ctr++){
            p.printer(s);
        }
    }
}

class p49{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("#");
        MyThread1 t3 = new MyThread1("$");

        t1.start();
        t2.start();
        t3.start();
    }
}