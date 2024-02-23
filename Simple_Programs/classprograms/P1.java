package classprograms;

import java.util.Scanner;

class p1 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the String :");
      String s = sc.nextLine();
      int consonant = 0;
      int vowel = 0;

      for(int i = 0; i < s.length(); ++i) {
         char ch = s.charAt(i);
         if(ch != ' '){
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
                ++vowel;
            }
            else{
                ++consonant;
            }
        }
      }

      System.out.print("Vowels = " + vowel);
      System.out.print("\nConsonants = " + consonant);
      sc.close();
   }
}
