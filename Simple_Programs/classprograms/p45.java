package classprograms;

class threadr3 implements Runnable{
    public void run(){
        System.out.println("Thread1");
        System.out.println("Thread is "+Thread.currentThread().getPriority());
    }
}

class threadr4 implements Runnable{
    public void run(){
        System.out.println("Thread2");
        System.out.println("Thread is "+Thread.currentThread().getPriority());
    }
}

class p45{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("MAin Thread is "+Thread.currentThread().getPriority());
        threadr3 t1 = new threadr3();
        threadr4 t2 = new threadr4();
        Thread t3 = new Thread(t1);
        t3.setName("Thread1");
        Thread t4 = new Thread(t2);
        t4.setName("Thread2");
        t3.start();
        t4.start();
    }
}

