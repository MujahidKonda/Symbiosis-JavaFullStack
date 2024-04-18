package classprograms;

import java.util.ArrayList;
import java.util.Scanner;

class p56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList li = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Elements: ");
            int temp = sc.nextInt();

            if (!li.contains(temp)) {
                li.add(temp);

            }
        }
        System.out.println(li);

        System.out.println("Enter the element you want to remove: ");
        int removeElement = sc.nextInt();
        if (li.contains(removeElement)) {
            li.remove(Integer.valueOf(removeElement));
            li.remove(removeElement);
            System.out.println("Element removed");
        } else {
            System.out.println("Element not found");
        }
        System.out.println(li);

    }
}