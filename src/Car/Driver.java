package Car;

    public class Driver {
        private License license;   //права категории
        private Key key;
        private int age;

        public Driver(License license, Key key)

        public void open(){
            System.out.println("Open");
        }

        public void start(){
            System.out.println("Start");
        }

        public void drive(){
            System.out.println("Drive");
        }

        public void putpassangers(){
            System.out.println("Put Passangers");
        }

        public void refuel(){
            System.out.println("Refuel");
        }


        public License getLicense() {
            return license;
        }

        public Key getKey() {
            return key;
        }
    }
}

