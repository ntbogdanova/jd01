package car;

public class Motor{
    private int volume;//объем
    private int fuel; //количество топлива

    public Motor(int volume, int fuel){
        this.volume = volume;
        this.fuel = fuel;
    }


    public int getVolume() {
        return volume;
    }


    public int getFuel() {
        return fuel;
    }

}
