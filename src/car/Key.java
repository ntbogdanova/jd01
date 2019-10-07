package car;

public class Key {
  public int key;
  public int lock;

  public void isKey(){
    if(key == lock){
      System.out.println("Машину можно открыть.");
    }
    else{
      System.out.println("Не подходит ключ к замку!");
    }
  }

  public int getLock() {
    return lock;
  }

  public int getKey() {
    return key;
  }
}
