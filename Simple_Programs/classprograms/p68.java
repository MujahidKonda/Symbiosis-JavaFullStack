package classprograms;

class p68 extends Thread{
    public void run(){
        System.out.println("Hello....");
    }

    public static void main(String[] args){
        p68 t1 = new p68();
        t1.start();
        t1.stop();
        t1.start();
    }
}

