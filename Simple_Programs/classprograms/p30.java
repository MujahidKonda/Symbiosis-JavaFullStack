package classprograms;

interface printable1{
    void print();
}

interface showable1{
    void show();
}

class p30 implements printable1,showable1{

    public void print(){System.out.println("print");}
    public void show(){System.out.println("show");}

    public static void main(String[] args){
        p30 obj = new p30();
        obj.print();
        obj.show();
    }
}
