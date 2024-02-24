package classprograms; //

class p6 {
    int rollno;
    String name;
    static String college = "ITS";

    p6(int r,String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.print(rollno+" "+name+" "+college+"\n");
    }

    public static void main(String args[]){
        p6 s1 = new p6(111,"mujahid");
        p6 s2 = new p6(222,"arafat");

        s1.display();
        s2.display();
    }
}
