package Assignments.Assignment1;

/*
polymorphism: 
Polymorphism in Java refers to the ability of different classes to be treated as objects of a 
common superclass. There are two main types of polymorphism in Java: 
compile-time polymorphism also known as method overloading and 
runtime polymorphism also known as method overriding.

(i):    Compile-Time Polymorphism (Method Overloading):
Method overloading allows a class to have multiple methods with the same name but different parameter
lists.The compiler determines which method to call based on the number and types of arguments passed 
to it.
 */
 

public class ex6 
{
public static void add(int a,int b)
{
    System.out.println(a+" + "+b+" = "+(a+b));
}

public void add(int a,int b,int c)
{
    System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
}

public static void main(String[] args) {
    ex6 m1=new ex6();
    add(10, 20);
    m1.add(10, 20, 30);
}
}
