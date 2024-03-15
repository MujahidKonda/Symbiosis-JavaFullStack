package classprograms;

class animal {
    public void sound(String string){
        System.out.print(string);
    }

    public static void main(String[] args){
        animal ani = new animal();
        ani.sound("Meaow");
        ani.sound("Boaw");
        ani.sound("Chii chii");
    }
}
