class A {
    void m(Object m) {
        System.out.println("A");
    }
}

class B extends A {
    void k(String m) {
        System.out.println("B");
    }
    // pull down 'f()'
    void f() {
        m("1");
    }
}

class C extends B{

    void m(String m) {
        System.out.println("B");
    }
}