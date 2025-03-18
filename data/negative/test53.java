class A {
    public void doSomething() {
        System.out.println("In A");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("A");
        Method method = clazz.getMethod("doSomething");
        method.invoke(clazz.newInstance());
    }
}

class B extends A {

}