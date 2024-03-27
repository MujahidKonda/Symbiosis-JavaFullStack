package classprograms;

class thready implements Runnable{
    public void run(){
        System.out.println("Thread is "+Thread.currentThread().getName());
        Thread.yield();
        try{
            for(int i = 0; i<=10; i++){
                System.out.println("thread 1 value is : "+i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class p47 {
    public static void main(String[] args){
        thready t1 = new thready();
        Thread th1 = new Thread(t1);
        th1.start();
        System.out.println("Thread is "+Thread.currentThread().getName());
        for(int i = 0; i<=10; i++){
            System.out.println("Main Thread value is : "+i);
        }
    }
}
