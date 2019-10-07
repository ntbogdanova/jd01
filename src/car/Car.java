package car;

public abstract class Car implements ICar{
    private Motor motor;
    private Wheels wheels;
    private License license;
    private Sits sits;
    private int lock;
    private int sit;

    public Car(Motor motor, Wheels wheels, License license, Sits sits, int lock){
        this.motor = motor;
        this.wheels = wheels;
        this.license = license;
        this.sits = sits;
    }

    public Motor getMotor() {
        return motor;
    }

    public void isOpened(){
        System.out.println("Машина открыта.");
    }

    public void isStarted(){
        System.out.println("Машина завелась.");
    }

    public void go(){
        System.out.println("Машина едет.");
    }

    public void isRefueled(){
        System.out.println("Машина заправлена.");
    }

    public void putPassangers(int x){
        if(x>=sit) {
            System.out.println("Пассажиров больше, чем свободных мест.");
        }
        else{
            System.out.println("Пассажиры внутри.");
        }
    }

     public License getLicense() {
       return license;
    }


}
