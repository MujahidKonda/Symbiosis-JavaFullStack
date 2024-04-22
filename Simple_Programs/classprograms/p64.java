package classprograms;

import java.io.*;

class p64 {
    public static void main(String[] args){
        Student64 s1 =new Student64();
        s1.stuRollNo = 5;
        s1.stuName = "Pradeep";

        String fileName = "D:\\Symbiosis-JavaFullStack\\Simple_Programs\\classprograms\\p64example.txt";

        try{

            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object saved in file.");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
