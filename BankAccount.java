public class BankAccount {
   private int account_number=20429;
   private int account_balance=5000;
//    private String customer_name;
//    private String email;
//    private String phone_number;
    //  private boolean deposit = true;
    public int getAccount_number(int a){
        this.account_number=a;
        return account_number;
    }
    public int setAccount_number(int b){
        this.account_number=b;
        return account_number;

    }

    public int getAccount_balance(){
         return account_balance;
    }

    public void setAccount_balance(){
      
    }
    

    public int addFunds(int x){
        
        return this.account_balance+=x;
    }
    public int withdrawFunds(int x){
        if(this.account_balance<x){
            System.out.println("WITHDRAWAL NOT POSSIBLE -- OUT OF CASH");
            System.out.println("TRY WITHDRAWING SOME AMT. LESSER ");
            return -1;
          }
        return this.account_balance-=x;
    }



    

}
