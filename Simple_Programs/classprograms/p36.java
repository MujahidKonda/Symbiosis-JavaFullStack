package classprograms;

class xyz{
    int i = 15;
}

class abc extends xyz{
    int i = 10;
    void show(int i){
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }
}

class p36 extends abc{
    public static void main(String[] args){
        abc a = new abc();
        a.show(20);
    }
}
