package Sy3;

public class QunZhu {
        private String name;
        private double balance;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public QunZhu (String name, double balance) {
            this.name = name;
            this.balance = balance;
        }
    }


