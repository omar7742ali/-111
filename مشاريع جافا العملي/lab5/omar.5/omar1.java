public class omar1 {
    //lap5

        public static void main(String[] args) {
            TallyCounter counter = new TallyCounter();
            for (int i = 0; i < 5; i++)
                counter.click();
            System.out.println(counter.getCount());
            counter.back();
            System.out.println(counter.getCount());
            counter.rest();
            System.out.println(counter.getCount());
            counter.back();
            System.out.println(counter.getCount());
        }

}
