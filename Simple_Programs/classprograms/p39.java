package classprograms;

class p39 extends Thread{
    public void run(){
        System.out.println("Thread");
    }

    public static void main(String[] args){
        p39 t1 = new p39();
        t1.start();
        p39 t2 = new p39();
        t2.start();
    }
}
