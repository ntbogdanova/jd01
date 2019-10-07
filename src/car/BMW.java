package car;

public class BMW extends Car implements ICar{

    public BMW(Motor motor, Wheels wheels, License license, Sits sits, int lock) {
        super(motor, wheels, license, sits, lock);
    }

    public BMW(int volume, int fuel, int name, int rad, int license, int sits, int lock) {
        super(new Motor(volume, fuel), new Wheels(name, rad), new License(license), new Sits(sits), 1);
    }

    public void go(){
        super.go();
        System.out.println("Volume: " + this.getMotor().getVolume() + "Fuel: " + this.getMotor().getFuel());
    }
}
