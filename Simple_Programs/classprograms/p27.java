//interface


package classprograms;

interface printable{
    void print();
}

class p27 implements printable {
    public void print(){System.out.print("Hello");}

    public static void main(String args[]){
        p27 obj = new p27();
        obj.print();
    }
}
