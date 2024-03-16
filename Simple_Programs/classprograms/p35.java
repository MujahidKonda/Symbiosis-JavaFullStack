package classprograms;

class stud{
    int rol;

    void getroll(int r){
        rol = r;
    }

    void putrol(){
        System.out.println("Rol = "+rol);
    }
}

class mark extends stud{
    int mark1,mark2;

    void getmark(int m1,int m2){
        mark1 = m1;
        mark2 = m2;
    }

    void putmark(){
        System.out.println("Mark1 = "+mark1);
        System.out.println("Mark2 = "+mark2);
        System.out.println("Total marks = "+(mark1+mark2));
    }
}

interface skillmark{
    int marks =50;
    void dispmark();
}

class p35 extends mark implements skillmark{
    public void dispmark(){
        System.out.println("Skill marks are : "+marks);
    }

    public static void main(String[] args){
        p35 obj = new p35();
        obj.getroll(1);
        obj.putrol();
        obj.getmark(50,50);
        obj.putmark();
        obj.dispmark();
    }
}