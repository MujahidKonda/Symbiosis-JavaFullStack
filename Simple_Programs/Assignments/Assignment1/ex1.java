// Constructor in java is a special method whose name is the same as the class name and it does not require to be called seperately.
//it is automatically called when we create an onject of a class. It does not have a return type or a void.


package Assignments.Assignment1;

class ex1 {
    int rollno;
    String name;
    static String college = "ITS";
    
    ex1(int r,String n){
        rollno = r;
        name = n;
    }
    
    void display(){
        System.out.print(rollno+" "+name+" "+college+"\n");
    }
    
    public static void main(String args[]){
        ex1 s1 = new ex1(111,"mujahid");
        ex1 s2 = new ex1(222,"arafat");
    
        s1.display();
        s2.display();
    }
}
