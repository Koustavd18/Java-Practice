class Calcu {
    int arg1;
    int arg2;


//    public Calculator(int arg1, int arg2) {
//        this.arg1 = arg1;
//        this.arg2 = arg2;
//        System.out.println("Arg1" + this.arg1);
//        System.out.println("Arg 2" + this.arg2);
//    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}

class Calc {
    public static void main(String[] args) {


        Advcal ca = new Advcal();

        System.out.println(ca.add(2, 4));
        System.out.println(ca.sub(5, 6));
        System.out.println(ca.mul(5, 2));
        System.out.println(ca.div(4, 2));

    }
}