package classprograms;

interface calculation{
    int calc(int x,int y);
}

interface showable3 extends calculation{
    void show();
}

class p31 implements showable3{
    public int calc(int x, int y){
        int a = x*y;
        return a;
    }
    public void show(){
        
    }
}
