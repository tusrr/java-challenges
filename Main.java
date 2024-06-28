public class Main {

    public static void main(String[] args) {
            

    BankAccount customer = new BankAccount();
    System.out.println(customer.setAccount_number(22333));
    System.out.println("Account Num ="+customer.getAccount_number(20429));
    
    System.out.println("Account Balance ="+customer.getAccount_balance());
    
    customer.addFunds(500);
    System.out.println("Account Balance ="+customer.getAccount_balance());
    customer.withdrawFunds(6000);
    System.out.println("Account Balance ="+customer.getAccount_balance());
    customer.withdrawFunds(2000);
    System.out.println("Account Balance ="+customer.getAccount_balance());

    }
}
