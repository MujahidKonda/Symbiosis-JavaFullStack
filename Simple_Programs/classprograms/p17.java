package classprograms;

class test {
    private int id;

    void setid(int i){
        id = i;
    }

    int getid(){
        return id;
    }
}

class p17{
    public static void main(String args[]){
        test t = new test();
        t.setid(5);
        System.out.print("Id is = "+t.getid());
    }
}
