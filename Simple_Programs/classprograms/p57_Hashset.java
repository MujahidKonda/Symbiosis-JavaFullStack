package classprograms;

import java.util.HashSet;

class p57_Hashset {
    public static void main(String[] args){
        HashSet hs = new HashSet();

        hs.add(1);
        hs.add("Mujahid");
        hs.add(100.55);
        hs.add(true);
        hs.add(null);

        System.out.println(hs);

    }
}
