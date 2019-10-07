package car;

public class Wheels{
    private int name;            //тип колеса
    private int rad;             //радиус

    public Wheels(){
        int rad;
        int name;
    }

    public Wheels(int rad, int name){
        this.name = name;
    }

    public void setName(int name) {
        this.name = name;

        if(name == 1){
            System.out.println("Колёса зимние");
        }
        if(name == 2){
            System.out.println("Колёса летние");
         }
        if(name == 3){
            System.out.println("Колёса всесезонные");
        }
    }

    public int getRad() {
        return rad;
    }

    public int getName() {
        return name;
    }


}
