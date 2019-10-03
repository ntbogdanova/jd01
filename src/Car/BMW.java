package Car;

public class BMW extends Car {
    public BMW(Motor volume, Motor fuel, Wheels name, Wheels rad, License license, Sits sits, Lock lock) {
        super(volume, fuel, name, rad, license, sits, lock);
    }

    public BMW(int volume, int fuel, int name, int rad, String license, int sits, String lock) {
        super(new Motor(volume), new Motor(fuel), new Wheels(name), new Wheels(rad), new License(license), new Sits(sits), new Lock(lock));
    }

    public void go(){
        super.go();
        System.out.println("Volume: " + this.getVolume() + "Fuel: " + this.getFuel());
    }
}
