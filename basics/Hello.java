class Hello {
    public static void main (String args[]){

        int num1 = 12;
        int num2 = 15;
        int bitw = ~num1&num2;
        System.out.println(bitw);

        int result = ( ~num1&num2) ;
        long lo = 50l;
        float fl = 5.8f;
        double dub = 12e10;
        char name = 'C'; // Takes only single  quote
        boolean k = true;
        System.out.println(result);
        System.out.println(name);
        System.out.println(dub);

        byte b = 127;

        int a = 277;

        b  = (byte)a;

        System.out.println(b);

        int x = 5;

        int y = 10;

        int z = (x++ > 5 && y-- < 10) ? x-- : y;

        System.out.println(y);
    }
}