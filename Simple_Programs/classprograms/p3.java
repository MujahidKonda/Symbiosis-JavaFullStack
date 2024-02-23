package classprograms;

class add{
    int a= 5;
    int b= 5;
    public void sum(){
        System.out.printf("Sum is = %d",(a+b));
    }
}

class p3 {
    public static void  main(String[] args){
        add c = new add();
        c.sum();
    }
}
