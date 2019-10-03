package Car;

public class Motor{
    private int volume;//объем
    private int fuel; //количество топлива

    public Motor(){
        super();
        int volume;
        int fuel;
    }

    public Motor(int volume, int fuel){
        super();
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
