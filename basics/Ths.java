

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int n) {
        this();
        System.out.println("in A int");
    }

}

class B extends A {
    public B() {
        super(5);
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in b int");
    }
}


class Ths {
    public static void main(String args[]) {
        B Bee = new B(5);


    }
}