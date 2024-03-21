package classprograms;

class threadi extends Thread{
    public void run(){
        for(int i = 1; i<31; i++){
            System.out.println("i value is "+i);
        }
    }
}

class threadj extends Thread{
    public void run(){
        for(int j = 1; j<41; j++){
            if(j%2 == 0){
                System.out.println("j value is "+j);
            }
        }
    }
}

class threadk extends Thread{
    public void run(){
        for(int k = 1; k<51; k++){
            if(k%2 != 0){
                System.out.println("k value is "+k);
            }
        }
    }
}

class p41 {
    public static void main(String[] args){
        threadi valuei = new threadi();
        threadj valuej = new threadj();
        threadk valuek = new threadk();
        valuei.start();
        valuej.start();
        valuek.start();
    }
}
