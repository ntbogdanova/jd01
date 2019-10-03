package Car;

public class Main {
    public static void main(String[] args){
    ICar BMW = new BMW(new Motor(100, 25), new Wheels(5, 2), new Sits(5));
    BMW.isStarted();
    BMW.go();
    }
}
