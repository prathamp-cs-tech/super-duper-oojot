import java.util.*;
class Account{
    String customer;
    int accno;
    String acctype;
    double bal=0;
    public Account(){
        customer="\0";
        accno=0;
        acctype="\0";
    }
    public Account(String c, int a, String at){
        customer=c;
        accno=a;
        acctype=at;
    }
    public void deposit(int d){
        bal+=d;
    }
    public void dis(){
        System.out.println("The balance is:" + bal);
    }
}
class Curacct extends Account{
    int servicecharge;
    public Curacct(String c,int a, String at){
       super(c,a,at);
    } 
    public void checkbook(){
        System.out.println("Take checkbook");
    }
    public void checkmb(){
        if(bal<1000){
            servicecharge+=500;
        }    
    }
}

class Savacct extends Account{
    public double interest=0.05;
    public Savacct(String c,int a, String at){
       super(c,a,at);
    } 
    public void compint(int n, int t){
        int a=n*t;
        bal=bal*(Math.pow((1+interest/n),a));
    }
    public void withdrawal(int w){
        bal=bal-w;
    }
}


public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String cu = sc.nextLine();

        System.out.print("Enter account number: ");
        int an = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account type (Current/Savings): ");
        String at = sc.nextLine();

        if (at.equals("Current")) {
            Curacct c = new Curacct(cu, an, at);
            System.out.print("Enter deposit amount: ");
            int dep = sc.nextInt();
            c.deposit(dep);
            c.checkmb();
            c.checkbook();
            c.dis();
        } else if (at.equals("Savings")) {
            Savacct s = new Savacct(cu, an, at);
            System.out.print("Enter deposit amount: ");
            int dep = sc.nextInt();
            s.deposit(dep);

            System.out.print("Enter withdrawal amount: ");
            int wd = sc.nextInt();
            s.withdrawal(wd);

            System.out.println("Enter values for interest calculation");
            System.out.print("Enter number of times compounding/year:");
            int n = sc.nextInt();
            System.out.print("Enter number of years:");
            int t = sc.nextInt();
            s.compint(n,t);
            s.dis();
        } else {
            System.out.println("Enter 'Current' or 'Savings' only!");
        }
        sc.close();
    }
}
