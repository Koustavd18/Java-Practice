class Calculato
{

    int a;
    public int add(int a, int b)
    {
        System.out.println("add from Calculator class");
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public void lala(){
        System.out.println("LALLALALLALA");
    }

    public String foo(int b){

        if(b>= 10){
            return "Boo";
        }

        return "Nikalodean";
    }
}

public class Demo{
    public static void main(String args[]){
        int num1=4;
        int num2=5;
//
//        int result = num1+num2;
//
//        System.out.println(result);

        Calculato calc = new Calculato();

        System.out.println(calc.add(1,1));
        System.out.println(calc.add(1,1,1));

        calc.lala();

        String str = calc.foo(2);

        System.out.println(str);

    }
}