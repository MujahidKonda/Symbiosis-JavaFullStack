package classprograms;

class threadr1 implements Runnable{
    public void run(){
        System.out.println("Thread1");
        System.out.println("Thread is "+Thread.currentThread().getName());
    }
}

class threadr2 implements Runnable{
    public void run(){
        System.out.println("Thread2");
        System.out.println("Thread is "+Thread.currentThread().getName());
    }
}

class p44{
    public static void main(String[] args){
        System.out.println("Hello");
        System.out.println("MAin Thread is "+Thread.currentThread().getName());
        threadr1 t1 = new threadr1();
        threadr2 t2 = new threadr2();
        Thread t3 = new Thread(t1);
        t3.setName("Thread1");
        Thread t4 = new Thread(t2);
        t4.setName("Thread2");
        t3.start();
        t4.start();
    }
}

