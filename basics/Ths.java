
@Deprecated
class Ab {
    public Ab() {
        System.out.println("in A");
    }

    public Ab(int n) {
        this();
        System.out.println("in A int");
    }

}

class Bb extends Ab {
    public Bb() {
        super(5);
        System.out.println("in B");
    }

    public Bb(int n) {
        this();
        System.out.println("in b int");
    }
}

class Ths {
    public static void main(String args[]) {
        Bb Bee = new Bb(5);

    }
}