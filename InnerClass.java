public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.outerMethod();

        Outer.Inner obj1 = new Outer.Inner();
        obj1.innerMethod();
    }
}

class Outer {
    int a;

    public void outerMethod() {
        System.out.println("Outer Class");
    }

    static class Inner {
        public void innerMethod() {
            System.out.println("Inner Method");
        }
    }

}