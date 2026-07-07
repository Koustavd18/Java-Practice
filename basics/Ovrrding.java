class A {
    public void show() {
        System.out.println("In A show");
    }

    public void show1() {
        System.out.println("In A show 1");
    }

    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    public void show() {
        System.out.println("in b Show");
    }

    public void show2() {
        System.out.println("in b show 2");
    }
}

class Ovrrding {
    public static void main(String args[]) {

        A bee = new B();
        B bee1 = (B) bee;
        bee1.show2();
        bee.show();
        bee.config();

        double d = 4.5;
        int i = (int) d;

        System.out.println(i);


    }
}