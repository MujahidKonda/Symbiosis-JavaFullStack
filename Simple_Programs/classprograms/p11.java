package classprograms;

class p11 {
    int id;
    String name;

    p11(int i, String n){
        id = i;
        name = n;
    }

    void display(){
        System.out.print(id+name);
    }

    public static void main(String[] args) {
        p11 s1 = new p11(111,"karan");
        p11 s2 = new p11(222,"MANGO");

        s1.display();
        s2.display();
        
    }
    
}
