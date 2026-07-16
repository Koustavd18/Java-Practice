interface Computer {
    void code();
}

enum Status{
    coding, analysing, researching, debugging, fixing;
}


 class Laptop implements Computer {
    public void code(){
        System.out.println("Coding in a thinkpad");
    }
}


 class Desktop implements Computer{
 public void code(){
    System.out.println("coding");
 }
}

public class Coder{

    public static void main(String s[]){

        Computer l = new Laptop();
        Computer d =new Desktop();
        
        Status[] stat = Status.values();

        for (Status st : stat){
            System.out.println(st);
        }

        l.code();
        d.code();
    }





}