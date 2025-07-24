
import java.util.Scanner;

class Atm {
    float Balance=50000;
    int PIN=5566;

    public void checkpin(){
        System.out.println("Enter your PIN :");
        Scanner sc=new Scanner(System.in);
        int enterpin=sc.nextInt();
        if(enterpin==PIN){
           manu();
        }else{
            System.out.println("Enter a valid PIN");
        }
    }


    public void manu(){
        System.out.println("Enter your choice :");
        System.out.println("1.check a/c balance");
        System.out.println("2.withdraw Money");
        System.out.println("3.Deposit Money");
        System.out.println("4.Exit");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkBalance();
        }
        else if(opt==2){
            withdrawMoney();
        }
        else if(opt==3){
            depositMoney();
        }
        else if(opt==4){
            return;
        }
        else {
          System.out.println("Enter a valid choice");
        }
    }


    public void checkBalance(){
        System.out.println("Balance :"+ Balance);
        manu();
    }


    public void withdrawMoney(){
        System.out.println("Enter Amout for withdraw:");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money withdraw Successful");
        }
        manu();
    }

    public void depositMoney(){
         System.out.println("Enter the amount :");
         Scanner sc=new Scanner(System.in);
         float amount=sc.nextInt();
         Balance=Balance+amount;
         System.out.println("money Deposited successfully");
         manu();
    }
}
class AtmMachine{
    public static void main(String[] args){
        Atm a1=new Atm();
        a1.checkpin();
    }
}

