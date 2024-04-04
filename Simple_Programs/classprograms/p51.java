package classprograms;

import java.io.*;

class p51 {
    public static void main(String[] args) {
        try{
            File f1 = new File("D:/p51.txt");
            if(f1.createNewFile()){
                System.out.println("New File Created");
                System.out.println("Can File Exists "+f1.exists());
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
