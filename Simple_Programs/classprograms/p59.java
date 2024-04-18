package classprograms;

import java.util.*;

class p59 {
    public static void main(String[] args){
        ArrayList arrl = new ArrayList();

        arrl.add(1);
        arrl.add("Mujahid");
        arrl.add(100.55);
        arrl.add("");
        arrl.add(true);
        arrl.add(null);

        System.out.println(arrl);

        ListIterator litr = arrl.listIterator();
        litr.next();
        litr.next();
        litr.next();
        litr.next();


        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }
    }
}
