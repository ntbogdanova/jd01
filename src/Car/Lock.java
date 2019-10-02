package Car;

public class Lock extends Object {
    private Key key1;
    public isKey(Key key1){
        if(key1==this.key1){
            System.out.println("Подходит");
        }
        else System.out.println("Не подходит");
    }

    public Car.Key getKey1() {
        return key1;
    }

    public void setKey1(Car.Key key1) {
        this.key1 = key1;
    }
}
