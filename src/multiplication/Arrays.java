package multiplication;

public class Arrays {
        public static void checkElementsDoWhile(){
            System.out.println("DoWhile: ");
            int a[] = {1, 2, 5, 8, 9};
            int i=0;
            do {
                System.out.print(a[i] + "; ");
                i++;
            }
            while (i<a.length);
        }

        public static void checkElementsWhile(){
            System.out.println("While: ");
            int a[] = {1, 2, 5, 8, 9};
            int i=0;
            while (i<a.length){
                System.out.print(a[i] + "; ");
                i++;
            }
        }

        public static void checkElementsFor(){
            System.out.println("For:");
            int a[] = {1, 2, 5, 8, 9};
            for(int i=0; i<a.length; i++){
                System.out.print(a[i] + "; ");
            }
        }

        public static void checkElementsForEach(){
            System.out.println("For each: ");
            int a[] = {1, 2, 5, 8, 9};
            for(int i : a ){
                System.out.print(i + "; ");
            }
        }

        public static void chooseSecond(){
            System.out.print("Вывод каждого второго элемента массива: ");
            int a[] = {1, 2, 5, 8, 9, 25, 58, 44};
            int i=1;
            while (i<a.length){
                System.out.print(a[i] + "; ");
                i=i+2;
            }
        }

        public static void chooseSecondWithNull(){
            System.out.print("Вывод прекращается, если null: ");
            String a[] = {"1", "2", "5", "8", "9", null, "58", "44", "258", "852"};
            for (int i = 1; i<a.length; i = i +2){
                System.out.print(a[i] + "; ");
                if (a[i] == null){
                    break;
                }
            }
        }
}
