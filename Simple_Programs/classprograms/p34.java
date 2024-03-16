package classprograms;


class class1{
    public void disp(){
        System.out.print("\nThis is class one");
    }
}

class class2 extends class1
{
    public void disp2(){
        System.out.print("\nThis is class two");
    } 
}


interface inter1{
    void disp3();
}

class p34 extends class2 implements inter1{

    public void disp3(){ System.out.print("\nThis is interface1");}

    public static void main(String[] args){
        p34 obj = new p34();
        obj.disp();
        obj.disp2();
        obj.disp3();
    }
}
