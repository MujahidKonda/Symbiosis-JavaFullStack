package classprograms;

class threads1 implements Runnable{
    public void run(){
        System.out.println("Thread is "+Thread.currentThread().getName());
        try{
            for(int i = 0; i<=10; i++){
                System.out.println("thread 1 value is : "+i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class threads2 implements Runnable{
    public void run(){
        System.out.println("Thread is "+Thread.currentThread().getName());
        try{
            for(int i = 0; i<=10; i++){
                System.out.println("thread 2 value is : "+i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class p46 {
    public static void main(String[] args){
        System.out.println("Thread is "+Thread.currentThread().getName());
        threads1 t1 = new threads1();
        threads2 t2 = new threads2();
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}

