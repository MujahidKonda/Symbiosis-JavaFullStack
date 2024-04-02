package classprograms;

class MyPrinter{
    public void printer(int value){
        for ( int i = 0; i < 10; i++){
            System.out.print(value);
        }
        System.out.println("");
    }
}

class MyThread extends Thread{
    int i;
    MyPrinter p;
    MyThread(int i){
        this.i = i;
        p = new MyPrinter();
    }

    public void run(){
        for(int ctr = 0; ctr < 10; ctr++){
            p.printer(i);
        }
    }
}

class p48 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(4);
        MyThread t2 = new MyThread(1);

        t1.start();
        t2.start();

        System.out.println("Main Ends");
    }
}
