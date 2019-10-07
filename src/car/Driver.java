package car;

    public class Driver implements IDriver{
        private Car car;
        private int key;
        private int license;   //права категории
        private int age; //стаж
        private int x;

        public Driver(int license, int age, int key){
            this.age = age;
            this.key = key;
        }

        public int getAge() {
            System.out.println("Стаж водителя: " + age + " года.");
            return age;
        }

        public void open() {
            if(key==1){
            System.out.println("Ключ подходит, водитель открыл машину.");
            }
            else
                System.out.println("Уходи.");
        }

        public void drive(){
            System.out.println("Водитель завёл машину и находится за рулём.");
        }
}

