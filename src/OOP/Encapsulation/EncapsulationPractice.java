package OOP.Encapsulation;

//public class EncapsulationPractice {

    //// 🔥 Constructor + Getter + Setter Together.

    //Important Encapsulation idea: private data ko control karne ke liye getter/setter diye jaate hain; har variable ke liye dono methods compulsory nahi hain. 🔐


  class BankAccount {
        private String accountHolder;
        private double balance;

        // Constructor
        BankAccount(String accountHolder, double balance) {

            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // Setter
        public void setAccountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
        }
        // Getter
        public String getAccountHolder(){
            return accountHolder;
        }
        // Setter with validation
        public void setBalance(double balance){
            if( balance >=0){ // Setter Validation Method
                this.balance = balance;
            }
        }
        // Getter
        public double getBalance(){
            return balance;
        }
    }
    public class EncapsulationPractice {
       public static void main(String[] args) {

           BankAccount ba = new BankAccount("Shivaay" , 1500);

           System.out.println("Account Holder Name:" + ba.getAccountHolder()+ "," + "Balance:" + ba.getBalance());

           ba.setAccountHolder("Rahul");
           ba.setBalance(2000);

           System.out.println("Account Holder Name:" + ba.getAccountHolder()+ "," + "Balance:" + ba.getBalance());

           ba.setAccountHolder("Bhaskar");
           ba.setBalance(6000);

           System.out.println("Balance:" + ba.getBalance());
           System.out.println("Account Holder Name:" + ba.getAccountHolder());

           ba.setBalance(-5000); // This value is not print according to Setter Validation method.

           System.out.println("Balance:" + ba.getBalance());
       }
    }