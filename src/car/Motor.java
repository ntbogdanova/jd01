package car;

public class Motor extends Car{
    private static int volume;

    private int fuel; //количество топлива

    public Motor(int volume, int fuel){
        super();
        this.volume = volume;
        this.fuel = fuel;
    }


    public static int getVolume() {
        return volume;
    }


    public int getFuel() {
        return fuel;
    }

}
