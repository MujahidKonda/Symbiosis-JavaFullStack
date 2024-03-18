//calculate area and circumference of circle using multiple classes.

package Assignments.Assignment1;


class circle{
    private int rad;
    void getradius(int r){
        rad = r;
    }

    int putradius(){
        return rad;
    }
    
}

class ex3 {
    public static void main(String[] args){
        float pi = 3.14f;
        circle cir = new circle();
        cir.getradius(5);
        int r = cir.putradius();
        System.out.println("Circumference of circle = "+(2*pi*r));
        System.out.println("Area of circle = "+(pi*r*r));
    }
}
