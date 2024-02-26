package classprograms;

class p9 {
    int rollno;
    String name;
    static String college = "ITS";

    void getdata(int r,String n){
        rollno = r;
        name = n;
    }

    static void update(){
        college = "NBN";
    }

    void display(){
        System.out.print(rollno+" "+name+" "+college+"\n");
    }

    public static void main(String args[]){
        p9 s = new p9();
        s.getdata(20, "Saeed");
        s.display();

        p9 s1 = new p9();
        s1.getdata(30, "Mujahid");
        s1.display();
        p9.update();
        s1.display();
    }
}
