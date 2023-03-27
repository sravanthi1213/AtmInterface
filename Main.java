import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    { 
        int Bal = 100000, Withdraw, Deposit;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Set pin");
        int pin=sc.nextInt();
        System.out.println("Enter Pin to enter into transaction: ");
        int pass=sc.nextInt();
        int i=1;
        if(pass!=pin)
        {
            while(true)
            {
                i++;
            System.out.println("Wrong Pin");
            System.out.println("Re-enter pin (Attempts Remaining :- "+i+") : ");
            pass=sc.nextInt();
            if(pass==pin)
            {
                break;
            }
            if(i==3){
                System.out.println("Trails out of limit,please try later !");
            System.exit(0);
            }
            }
        }
        if(pass==pin)
        {
            System.out.println("Welcome"); 
            System.out.println("Choose your choice");  
            while(true)
            {
                System.out.println("1. Balance Check");
                System.out.println("2. Withdraw money");
                System.out.println("3. Deposit money");
                System.out.println("4. Exit");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:System.out.println("Balance is :- "+Bal);
                           System.out.println("");
                    break;
                    case 2: System.out.println("Enter Withdrawal amount : ");
                            Withdraw=sc.nextInt();
                    if(Withdraw>Bal||Bal==0)
                    {
                        System.out.printf("Sorry you have insufficient balance!!\n");
                        break;
                    }
                    System.out.println("Collect your amount");
                    Bal=Bal-Withdraw;
                    System.out.println("");
                    break;
                    case 3: System.out.print("Enter amount to be deposited: ");
                            Deposit = sc.nextInt();
                            Bal = Bal + Deposit;
                            System.out.println("Your Money has been deposited successfully");
                            System.out.println(" ");
                    break;

                    case 4: System.out.println("We are Happy to Service you... Thank you");
                            System.exit(0);
                }
            }
       }
    }
}