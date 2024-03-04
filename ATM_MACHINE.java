// ATM machine set pin.
import java.util.*;


class ATM{
    float balance;
    int pin=9263;
    
    public void checkpin(){
        System.out.print("*** Welcome to SBI *** \n");
        System.out.println("Enter your Pin:");
        Scanner sc = new Scanner(System.in);
        int  enterpin = sc.nextInt();
        
        if(enterpin==pin){
            menu();
        }
        else{
            System.out.println(" Enter a valid Pin.");
        }
    }
    
    public void menu(){
        System.out.println("*** Choose a option ***");
        System.out.println("1.Check A/c balnce !");
        System.out.println("2. Withdraw money !");
        System.out.println("3.Deposit money !");
        System.out.println("4.Exit !");
        
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        
        if(opt==1){
            checkBalance();
            menu();
        }
        else if(opt==2){
            withdraw();
            menu();
        }
        else if(opt==3){
            deposit();
            menu();
        }
        else if(opt==4){
            System.out.println("Thanks for visiting !");
            return;
        }
        else{
            System.out.println("Enter a valid option");
        }
    }
    
    public void checkBalance(){
        System.out.println("Balance is "+balance);
        menu();
    }
    
    public void withdraw(){
        System.out.println("Enter amount to be withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        
        if(balance < amount ){
            System.out.println("Insufficient Balance");
        }
        else{
            balance = balance - amount;
        }
        menu();
    }
    
    public void deposit(){
        System.out.println("Enter amount to be deposite");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        
        balance = balance + amount;
        menu();
    }
    
}
class ATM_MACHINE {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}