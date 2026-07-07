public class Cars {
    public static void main(String[] args) {

        Car obj = new GT3();
        obj.Drive();
        obj.playMusic();
    }
}

abstract class Car {
    public abstract void Drive();

    public void playMusic() {
        System.out.println("Playing Musicc.....Bado Badi");
    }
}

class GT3 extends Car {
    public void Drive() {
        System.out.println("Im fast as Light bouy");
    }

}
