package Pack1;

import java.util.Scanner;

public class BankProject {
    double balance = 789640;
    String name = "Mallikarjuna";
    String password = "mks#123";
    String account_number = "11820097";
    boolean loginstatus = false;
    Scanner sc;

    public BankProject() {
        sc = new Scanner(System.in);
    }

    public void userLogin(String accno, String pass) {
        if (accno.equals(account_number) && pass.equals(password)) {
            loginstatus = true;
            System.out.println("Login successfull");
        } else {
            System.out.println("Either account number or password is incorrect");
        }
    }

    public void depositAmount(double amount) {
        if (loginstatus) {
            balance = balance + amount;
            System.out.println("Amount Successfully Deposited");
            System.out.println("New Balance is: " + balance);
        }
        else {
            System.out.println("Please Login First");
        }
    }

    public void withdrawAmount(double amount) {
        if (loginstatus)
        {
            if (amount > balance)
            {
                System.out.println("You have insufficient balance");
            }
            else
            {
                balance = balance - amount;
                System.out.println("Amount Successfully Withdraw");
                System.out.println("New Balance is: " + balance);
            }
        }
        else
        {
            System.out.println("Please login first");
        }
    }
    public void Balance()
    {
        if(loginstatus){
            System.out.println("Balance: " +balance);
        }
        else
        {
            System.out.println("Please Login First");
        }
    }
    public int changePassword(String pass)
    {
        int status = 0;
        if(pass.equals(password))
        {
            System.out.println("Enter new Password");
            String npass = sc.nextLine();
            System.out.println("Retype Password");
            String repass = sc.nextLine();

            if(npass.equals(repass)){
                password = npass;
                status = 1;
            }
        }
        return status;
    }
}