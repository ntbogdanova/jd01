package Car;

public abstract class Car implements ICar{
    private Motor volume;
    private Motor fuel;
    private Wheels wheels;
    private License license;
    private Sits sits;
    private Lock lock;
    private int sit;

    public Car() {
        int volume;
        int fuel;
        int wheels;
        int license;
        int sits;
        int lock;
    }

    public Car(Motor volume, Motor fuel, Wheels wheels, License license, Sits sits, Lock lock){
        this.volume = volume;
        this.fuel = fuel;
        this.wheels = wheels;
        this.license = license;
        this.sits = sits;
        this.lock = lock;
    }

    public Car(Motor motor, Wheels wheels, License license, Sits sits, Lock lock) {
        this.fuel = motor;
        this.volume = motor;
        this.wheels = wheels;
        this.license = license;
        this.sits = sits;
        this.lock = lock;
    }

    public void isOpened(){
        System.out.println("Машина открыта");
    }

    public void isStarted(){
        System.out.println("Машина завелась");
    }

    public void go(){
        System.out.println("Машина едет");
    }

    public void isRefueled(){
        System.out.println("Машина заправлена");
    }

    public void putPassangers(int x){
        if(x>=sit) {
            System.out.println("Пассажиров больше, чем свободных мест");
        }
        else{
            System.out.println("Пассажиры внутри");
        }
    }

     public License getLicense() {
       return license;
    }

    public Lock getLock() {
        return lock;
    }

}
