public class Ano {
    public static void main(String[] a) {
        A obj = new A() {
            public void show() {
                System.out.println("In a Anonymous Class");
            }
        };
        obj.show();

        B obj1 = new B() {
            public void show() {
                System.out.println("In an anonymous abstract inner class");
            }
        };
        obj1.show();
    }
}

class A {
    public void show() {
        System.out.println("In A show");
    }
}

abstract class B {
    public abstract void show();
}