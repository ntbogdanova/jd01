package shifts;

import javax.management.remote.rmi._RMIConnection_Stub;

    public class Shift {

        public static int intRightShift(int a, int b){
            int c = a>>b;
            System.out.println("Сдвиг вправо: " + c + " = " + a + " >> " + b);
            return c;
        }

        public static int intLeftShift(int a, int b){
            int c = a<<b;
            System.out.println("Сдвиг влево: " + c + " = " + a + " << " + b);
            return c;
        }

        public static double doubleRightShift(double a, double b){
            System.out.println("Невозможен сдвиг вправо дробных чисел.");
            return 0;
        }

        public static double doubleLeftShift(double a, double b) {
            System.out.println("Невозможен сдвиг влево дробных чисел.");
            return 0;
        }

        public static int minusRightShift(int a, int b){
            int c = a<<b;
            System.out.println("Свдиг вправо отрицательного числа: " + c + " = " + a + " << " + b);
            return c;
        }

        public static int minusLeftShift(int a, int b){
            int c = a>>b;
            System.out.println("Свдиг влево отрицательного числа: " + c + " = " + a + " >> " + b);
            return c;
        }

    }

