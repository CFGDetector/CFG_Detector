class A {
}
class B {
    void main() {
        final int b = 2;
        new A() {
            void m() {
                System.out.println(b);
            }
        };
    }
}
class C {
    A a;
    protected final int b = 1;
}