package classprograms;
class p38 extends Thread{
    public void run(){
        System.out.print("Thread is running.....");
    }
    public static void main(String[] args){
        p38 t1 = new p38();
        t1.start();
    }
}
