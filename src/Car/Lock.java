package Car;

public class Lock extends Car {
    private Key key;

    public void isKey(Key key1){
        if(key1==this.key){
            System.out.println("Подходит");
        }
        else System.out.println("Не подходит");
    }
 }


