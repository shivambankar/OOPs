/**Design a banking system where a customer can open a new account, check account
 account balance and withdraw some money from his account */


public class BankAccount {
    public String accountHolderName;
    private int balance;
    private String emaiId;
    private String phoneNumber;

/**I don't want anyone to see directly hence private.
now let's do getter and setter for those private ones.*/

    public int getBalance() {
    return balance;
}
    public void setBalance(int balance) {
    this.balance = balance;
}

    public String getEmaiId() {
    return emaiId;
}
    public void setEmaiId(String emaiId) {
    this.emaiId = emaiId;
}

    public String getPhoneNumber() {
    return phoneNumber;
}
    public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}


//Now we can set these private parameters using public method.

    public void openAccount(){
    //do account opening activities like customer verification, save in db
    System.out.println("Account opened for" + accountHolderName);
}  //if someone wants to open account, he has to call this method.(and his
   //account will be opened)

    public void checkBalance() {
    System.out.println("Account balance is " + balance);
}

    public void addMoney(int amount) {
    if(amount > 0){
        balance = balance + amount;
        System.out.println(amount + "ruppes added to account, " + 
        "updated balance is" + balance);
    }else{
        System.out.println("can't add money");
    }
    }
    

    public void withdrawMoney(int amount) {
    if(balance > amount){
        balance = balance - amount;
        System.out.println(amount + "rupees withdrawn from account");
    }else{
        System.out.println("insufficient funds");
    }
}
}


/**These methods(addmoney,withdrawmoney) are actually Data hiding.So this data
isn't visible to outsider's.Only through this methods they can
access the private data.*/
