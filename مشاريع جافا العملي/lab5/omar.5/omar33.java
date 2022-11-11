public class omar33 {
    // lab 5 BankAccountTester

        public static void main(String[] args) {


            System.out.println("H3---------------------------------------------------------------");
            //Homework 3
            BankAccount account3 = new BankAccount();
            account3.deposit(1000);
            account3.withdraw(500);
            account3.withdraw(400);
            System.out.println("Expected = $100");
            System.out.println("Real = $" + account3.getBalance());


            System.out.println("H4---------------------------------------------------------------");
            //Homework 4
            BankAccount account4 = new BankAccount(1000);
            account4.addInterest(10);
            System.out.println("Expected = $1100");
            System.out.println("Real = $" + account4.getBalance());


            System.out.println("H5---------------------------------------------------------------");
            //Homework 5
            BankAccount account5 = new BankAccount(account4);
            System.out.println("account4 = " + account4.getBalance());
            System.out.println("account5 = " + account5.getBalance());


            System.out.println("H6---------------------------------------------------------------");
            //Homework 6
            BankAccount account6 = new BankAccount(1000, 10);
            account6.addInterest();
            System.out.println("Expected = $1100");
            System.out.println("Real = $" + account6.getBalance());
        }



}
