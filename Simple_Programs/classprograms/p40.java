package classprograms;

class thread1 extends Thread {
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

class p40 {
    public static void main(String[] args){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
