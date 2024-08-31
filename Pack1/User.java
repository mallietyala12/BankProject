package Pack1;
public class User
{
    public static void main(String[] args)
    {
        BankProject ob = new BankProject();
        int choice;
        do{
            System.out.println("1. Login");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            System.out.println("--------------------");
            System.out.println("Enter Your Choice");
            choice = ob.sc.nextInt();
            ob.sc.nextLine();

            if(choice==1){
                if(ob.loginstatus)
                {
                    System.out.println("You are already Logged in");
                }
                else{
                    System.out.println("Enter Account number:");
                    String accno = ob.sc.nextLine();

                    System.out.println("Enter Password:");
                    String pass = ob.sc.nextLine();
                    ob.userLogin(accno,pass);
                }
            }
            else if (choice==2)
            {
                System.out.println("Enter amount to be deposited: ");
                ob.depositAmount(ob.sc.nextDouble());
            }
            else if (choice==3)
            {
                System.out.println("Enter amount to be withdrawn: ");
                ob.withdrawAmount(ob.sc.nextDouble());
            }
            else if (choice==4)
            {
                ob.Balance();
            }
            else if (choice==5)
            {
                System.out.println("Enter Your Password");
                int status = ob.changePassword((ob.sc.nextLine()));

                if(status==1)
                {
                    System.out.println("Password Change Successfull");
                }
                else
                {
                    System.out.println("New password does not match the Original password ");
                }
            }
            else if (choice==6)
            {
                System.out.println("You are Logged Out");
                System.exit(0);
            }
        }while(choice!=6);
    }
}
