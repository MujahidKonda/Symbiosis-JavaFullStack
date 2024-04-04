package classprograms;

import java.util.Scanner;

class converter{
    public StringBuffer convert(String str){
        StringBuffer newstr = new StringBuffer(str);
        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        return newstr;
    }
}

class p52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        converter obj = new converter();
        StringBuffer constr = obj.convert(str);
        
        System.out.println("The Converted String is : "+constr);
        sc.close();
    }
}
