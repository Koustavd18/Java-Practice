class Human {
   private int age ;
   private String name ;


   public Human() {
       age=12;
       name = "What's in the name";
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

   public void setName(String name){
       this.name = name;
   }
}

public class Encap {
 
    public static void main(String args[]){
        Human obj = new Human();
        System.out.println(obj.getName() + ":" + obj.getAge() );
        obj.setAge(28);
        obj.setName("Nameless Human");

        System.out.println(obj.getName() + ":" + obj.getAge() );
    }
}