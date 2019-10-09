package multiplication;

import car.*;

public class DifferentArrays {
    public static void diffArray(){
        ICar BMW1 = new BMW(25, 45, 1, 4, 1, 5, 1);
        ICar BMW2 = new BMW(30, 50, 2, 5, 3, 7, 2);

        Motor motor1 = new Motor(25, 40);
        Motor motor2 = new Motor(30, 50);

        Wheels wheels1 = new Wheels(12, 2);
        Wheels wheels2 = new Wheels(25, 3);

        ICar parts[] = {(ICar) motor1, (ICar) motor2, (ICar) wheels1, (ICar) wheels2};

        System.out.println("Элементы массива разных классов: ");

        for( int i=0; i < parts.length; i++){
            System.out.println(parts[i].toString());
        }

    }
}
