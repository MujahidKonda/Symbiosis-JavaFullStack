package classprograms;

import java.util.Scanner;

class p53 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String inputstr = sc.nextLine();
        inputstr = inputstr+" ";
        String word = "", small = "", large= "";
        String[] words = new String[100];
        int length = 0;

        for(int i = 0; i < inputstr.length(); i++){  
            if(inputstr.charAt(i) != ' '){  
                word = word + inputstr.charAt(i);  
            }  
            else{  
                words[length] = word;
                length++;   
                word = "";  
            }  
        }  
          
        small = large = words[0];  
        for(int k = 0; k < length; k++){  
              
            if(small.length() > words[k].length())  
                small = words[k];  
   
            if(large.length() < words[k].length())  
                large = words[k];  
        }  
          
        System.out.println("Smallest word: " + small);  
        System.out.println("Largest word: " + large);
        sc.close();
    }
}