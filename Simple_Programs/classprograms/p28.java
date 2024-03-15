package classprograms;

interface drawable{
    void draw();
}

class rectangle implements drawable{
    public void draw(){System.out.print("drawing rectangle\n");}
}

class circle implements drawable{
    public void draw(){System.out.print("drawing circle\n");}
}

class p28{
    public static void main(String args[]){
        drawable rec = new rectangle();
        rec.draw();
        
        drawable cir = new circle();
        cir.draw();

        rectangle r = new rectangle();
        r.draw();

        circle c = new circle();
        c.draw();
    }
}
