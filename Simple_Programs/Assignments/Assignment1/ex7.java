

/*Runtime Polymorphism (Method Overriding):
Method overriding allows a subclass to provide a specific implementation of a method that is already 
provided by its superclass.It occurs when a subclass has a method with the same signature as a method
in its superclass.The decision of which method to call is made at runtime based on the actual object 
type.*/
package Assignments.Assignment1;

class A {
    void m1() {
        System.out.println("Inside A's m1 method");
    }
}

class B extends A {
    void m1() {
        System.out.println("Inside B's m1 method");
    }
}

class C extends A {
    void m1() {
        System.out.println("Inside C's m1 method");
    }
}

class ex7 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        a.m1();
        b.m1();
        c.m1();
    }
}