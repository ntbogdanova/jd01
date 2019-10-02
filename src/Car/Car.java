package Car;

public abstract class Car {
    private Motor motor;
    private Wheels wheels;
    private License license;
    private Sits sits;
    private Lock lock;

    public Car(Motor motor, Wheels wheels, License license, Sits sits, Lock lock){
        this.motor = motor;
        this.wheels = wheels;
        this.license = license;
        this.sits = sits;
        this.lock = lock;
    }

}
