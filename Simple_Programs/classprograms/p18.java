package classprograms;

//inheritance start
class p18 {
    public void display(){
        System.out.print("i am paresnt class");
    }
}

class child extends p18{
    public static void main(String args[]){
        child msg = new child();
        msg.display();
    }
}
