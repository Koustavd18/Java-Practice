public class Face {
    public static void main(String[] a) {
        Wood obj = new Wood();
        obj.config();
        obj.price();
        System.out.println(Table.area);
        obj.leg();
    }
}

interface Table extends Legs {
    String Type = "WOOD";
    int area = 44;

    void config();

    void price();
}

interface Legs {
    void leg();
}

class Wood implements Table {
    public void config() {
        System.out.println("In Config");
    }

    public void price() {
        System.out.println("EXPENSIVE");
    }

    public void leg() {
        System.out.println("4 legs");
    }
}
