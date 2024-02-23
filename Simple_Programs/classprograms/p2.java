package classprograms;

import java.util.Scanner;

class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) { // Check for index out-of-bounds
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            if (c == ' ' && d != ' ') {
                count++;
            }
        }

        if (s.charAt(s.length() - 1) == ' ') { // Handle last character as well
            count++;
        }

        System.out.println("Sentences = " + count);
        sc.close();
    }
}
