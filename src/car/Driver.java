package car;

    public class Driver implements IDriver{
        private Car car;
       // private License license;   //права категории
        private int age; //стаж
        private int x;
        private int keyD;

      /*  public Driver(){
            int age;
            License license;
        }

        public Driver(License license, int age){
            this.license = license;
        }
*/
        public int getAge() {
            return age;
        }


        public void open() {
            // if(keyD==this.key1){
            System.out.println("Открыл машину");
            // }
            // else
            //    System.out.println("Уходи");
        }


}

