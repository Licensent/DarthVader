/**
 * Created by DarthVader on 22.07.2016.
 */

public class Amain {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
//        B b1 = new A();
        B b2 = new B();

        a1.print();
        a1.print2();

        a2.print();
        a2.print2();

//        b1.print();
//        b1.print2();

        b2.print();
        b2.print2();
    }
}

class A {
    public void print(){
        System.out.println("A");
    }

    public static void print2(){
        System.out.println("A2");
    }
}

class B extends A {
    public void print(){
        System.out.println("B");
    }

    public static void print2(){
        System.out.println("B2");
    }
}


