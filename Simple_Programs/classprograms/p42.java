package classprograms;

class p42 implements Runnable{
    
    public void run(){
        System.out.print("Thread is running.....");
    }

    public static void main(String[] args){
        p42 m1 = new p42();
        Thread t1 = new Thread(m1);
        t1.start();
    }
    
}
