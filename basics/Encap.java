class Human {
    private int age;
    private String name;


    public Human(int age, String name) {
        this.age = 12;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encap {

    public static void main(String args[]) {
        Human obj = new Human(19, "No_Name_&_No_Existance");
        System.out.println(obj.getName() + ":" + obj.getAge());
        obj.setAge(28);
        obj.setName("Nameless Human");

        System.out.println(obj.getName() + ":" + obj.getAge());
        8
    }
}