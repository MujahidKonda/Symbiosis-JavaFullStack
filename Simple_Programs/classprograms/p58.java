package classprograms;

import java.util.HashSet;
import java.util.Iterator;

class p58 {
    public static void main(String[] args){
        HashSet hs = new HashSet();

        hs.add(1);
        hs.add("Mujahid");
        hs.add(100.55);
        hs.add("");
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
