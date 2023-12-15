package bank;

/**
 *
 * @author Aj Cervantes
 */
import bank.account;

class main {
    public static void main(String[] args){
                
        account account = new account();
        
        account.setName("Annalyn Jean Maraviles Cervantes");
        account.setAge(19);
        account.setAccountNumber(20221154);
        account.deposit(90765354);
        account.deposit(87687766);
        account.displaySummary();
        
    }
}
