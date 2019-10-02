package Car;

public class Wheels extends Object{
    private String name;
    private int rad;             //радиус
    public String Z;
    String L;
    String V;

    public Wheels(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

        if(name == Z){
            System.out.println("Колёса зимние");
        }
        if(name == L){
            System.out.println("Колёса летние");
         }
        if(name == V){
            System.out.println("Колёса всесезонные");
        }
    }

}
