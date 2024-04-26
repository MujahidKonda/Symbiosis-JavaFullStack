package classprograms;

class first111{
    int i = 10;
    public first111(int j){
        System.out.println(i);
        this.i = j*10;
    }
}

class second222 extends first111{
    public second222(int j){
        super(j);
        System.out.println(i);
        this.i = j*20;
    }
}

public class p67{
    public static void main(String[] args){
        second222 n = new second222(20);
        System.out.println(n.i);
    }
}