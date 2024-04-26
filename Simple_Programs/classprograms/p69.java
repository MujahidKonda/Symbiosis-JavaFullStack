package classprograms;

class first11{
    public int i;
    private int j;
}

class second22 extends first11{
    void display(){
        super.j = super.i + 1;
        System.out.println(super.i +" "+super.j);
    }
}

class p69 {
    public static void main(String[] args){
        second22 obj = new second22();
        obj.i = 1;
        obj.j = 2;
        obj.display();
    }
}
