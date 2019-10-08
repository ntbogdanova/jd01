package multiplication;

public class Cycles {
    public static void table(){
        System.out.println("Вывод таблицы умножения: ");
         for (int a = 1; a < 11; a++) {
            for (int b = 1; b < 11; b++) {
                System.out.print(a + "*" + b + "=" + (a*b) + "\t" + "\t");
             }
            System.out.println(" ");
        }
    }

    public static void mulTo(int k){
        String str = "";
        int z=1;        //произведение
        for (int i=1; i<k; i++){
            z=z*i;
            str = str + i + "*";
        }
        z=z*k;
        str= str + k + "=";
        System.out.println("Произведение чисел от 1 до " + k + " : " + str + z);
    }

    public static void mulNum(int x){
        String string = String.valueOf(x);
        char[] array = string.toCharArray();

        String num="";
        int l = 1;
        for(int i=0; i < array.length; i++) {
            l = l * Character.digit(array[i], 10);
            num = num + (Character.digit(array[i], 10)) +"*";
        }
        System.out.println("Произведение цифр в числе " + x + ": " + num + "=" + l);
    }
}
