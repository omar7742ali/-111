public class omar3 {
    //lab5 BankAccount


        private double balance;
        private double rate;


        public BankAccount() {this(0);}


        public BankAccount(double balance) {this(balance, -1);}


        public BankAccount(double balance, double rate) {
            this.balance = balance;
            this.rate = rate;
        }


        public BankAccount(BankAccount that){this.balance = that.balance;}


        public void deposit(double amount) {balance += amount;}


        public void withdraw(double amount) {balance -= amount;}


        public void addInterest(){balance *= 1 + this.rate/100;}
        public void addInterest(double rate){balance *= 1 + rate/100;}
        public double getBalance() {return balance;}
    }
