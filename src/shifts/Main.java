package shifts;

    public class Main {
        public static void main(String[] args) {
            Shift.intLeftShift(3, 4);
            Shift.intRightShift(6, 3);
            Shift.doubleLeftShift(2.15, 5);
            Shift.doubleRightShift(2.15, 3);
            Shift.minusRightShift(-6, 5);
            Shift.minusLeftShift(-6, 5);

            Condition.equallity("Pa", "Pa");
            Condition.ternEquality("Lol", "Lal");

            int x=2;
            int y=8;

            int a=5 + 2 / 8;                                             // 5; первым выполняется деление 2 на 8 (2/8=0, т.к. получаем int), затем 5+0=5
            int b=(5 + 2) / 8;                                           // 0; первым выполняется действие в скобках 5+2=7, затем 7/8=0, т.к. значение должно быть int
            int c=(5 + x++) / 8;                                         // 0; изначально x=2 используется в выражении 5+2=7, затем 7/8=0
            int d=(5 + x++) / --y;                                       // 1; изначально x=2 используется в выражении 5+2=7, затем считается y=8, --8=7, 7/7=1
            int e=(5 * 2 >> x++) / --y;                                  // 0; выполняется 5*2=10, сдвиг 10>>2  (это 2), y=8, -y==7, 2/7=0, т..к. получаем int
            int f=(5 + 7 > 20 ? 68 : 22 * 2 >> x++) / --y;               // 0; 5+7=12, 12 не больше 20 (false), выполняется второе условие, 22*2=44, сдвиг 44 на 2 вправо, деление на 7
            // g=(5 + 7 > 20 ? 68 => 68 : 22 * 2 >> x++) / --y;           //ошибка компиляции, нет оператора =>
            boolean h=6 - 2 > 3 && 12 * 12 <= 119;                       //false; 6-2=4, 4 больше 3, первый операнд true; 12*12=144, 144 не меньше или равно 119, false; true&&false - это false
            boolean i=true && false;                                     //false; true&&false - это false


            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("d = " + d);
            System.out.println("e = " + e);
            System.out.println("f = " + f);
            System.out.println("h = " + h);
            System.out.println("i = " + i);

        }
    }


