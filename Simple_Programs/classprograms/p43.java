package classprograms;

class p43 implements Runnable{

    public void run(){
        for(int i = 1; i<=100; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        p43 r1 =new p43();
        Thread t1 = new Thread(r1);
        t1.start();
    }

}
