package Exercise7;

public class A {
    int ivar = 7;
    void m1(){
        System.out.print("A's m1, ");
    }

    void m2(){
        System.out.print("A's m2, ");
    }

    void m3(){
        System.out.print("A's m3, ");
    }
}

class B extends A {
    void m1(){
        System.out.print("B's m1, ");
    }
}

class C extends B {
    void m3(){
        System.out.print("C's m3, " + (ivar + 6));
    }
}