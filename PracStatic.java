class Phone {
    String brand;
    int price;
    static String type;

    public Phone() {
        brand = "Mobile Brand";
        price =200;
    }

    static{
        type = "Regular Phone";
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }

    public static void show1(Phone obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + type);
    }
}

class PracStatic{
    public static void main ( String[] args) {
        Phone obj1 = new Phone();
        obj1.brand = "Apple";
        obj1.price = 1200;
        Phone.type = "SmartPhone";

        Phone obj2 = new Phone();
        // obj2.brand = "Samsung";
        // obj2.price = 800;

        obj1.show();
        obj2.show();
        Phone.show1(obj1);
    }
}