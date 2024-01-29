class Conditions{
    public static void main(String args[]){
        System.out.println("____CONDITIONS____");

        int x = 8;
        int y = 7;
        int z = 6;

        if(x < y ){
            System.out.println("Satisfied");
        } else if (y<z){
            System.out.println("Maybe Satisfied");
        }else{
            System.out.println("Not Satisfied");
        }

        String result  = "";

        result = x==1 ? "Same same" : "but diffelent";

        System.out.println(result);
    }
}