
class Students{
    int age;
    String name;

}

class ArrObj {
    public static void main( String[] args){
        System.out.println("Array of Objects");

        Students s1 = new Students();
        s1.name = "Name A";
        s1.age = 16;

        Students s2 = new Students();
        s2.name = "Name B";
        s2.age= 17;

        Students s3 = new Students();
        s3.name = "Name C";
        s3.age =18;

        Students student[]  = new Students[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;


        for (int i = 0; i< student.length; i++){
            System.out.println("Student -> " + student[i].name + "  Age is -> " + student[i].age);
        }



    }
}
