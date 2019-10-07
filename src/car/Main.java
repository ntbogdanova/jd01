package car;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Main {

    public static void main(String[] args){
    ICar BMW = new BMW(new Motor(100, 25), new Wheels(5, 2), new License(1), new Sits(5), 1);
    BMW.isStarted();
    BMW.go();
    BMW.putPassangers(7);
    BMW.isRefueled();

    IDriver Driver = new Driver(2, 3, 1);
    Driver.open();
    Driver.drive();
    Driver.getAge();

    }
}
