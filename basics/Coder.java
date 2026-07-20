interface Computer {
    void code();
}

@FunctionalInterface
interface Aa {
    int go(int i);
}

enum Status {
    coding("Java"), analysing("Maven"), researching("Spring"), debugging("REST"), fixing;

    private String sub;

    private Status(String s) {
        this.sub = s;
    };

    private Status() {
        this.sub = "secret";
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String s) {
        this.sub = s;
    }

}

class Laptop implements Computer {

    @Override
    public void code() {
        System.out.println("Coding in a thinkpad");
    }
}

class Desktop implements Computer {

    @Override
    public void code() {
        System.out.println("coding");
    }
}

public class Coder {

    public static void main(String s[]) {

        Computer l = new Laptop();
        Computer d = new Desktop();

        Status[] stat = Status.values();

        for (Status st : stat) {
            System.out.println(st + " : " + st.getSub());
        }

        l.code();
        d.code();

        Aa obj = i -> i * 2;

        System.out.println(obj.go(10));
    }

}
