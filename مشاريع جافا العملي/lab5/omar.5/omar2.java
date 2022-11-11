public class omar2 {
 //lap5
        public static void main(String[] args) {
            TallyCounter counter = new TallyCounter();
            counter.setLimited(2);
            for (int i = 0; i < 5; i++)
                counter.click();
            System.out.println(counter.getCount());
        }
}
