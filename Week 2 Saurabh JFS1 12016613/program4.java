

public class program4 {
    static class A {
        public void methodA(){
            System.out.println("A");
        }
    }
    static class B extends A {
        public void methodB() {
            System.out.println("B");
        }
    }
    static class C extends B {
        public void MethodC(){
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        A a= new A();
        B b = new B();
        C c = new C();

        a.methodA();
        b.methodB();
        c.MethodC();
    }
}
