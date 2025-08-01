import java.util.Scanner;

public class Main1{
    public static void main(String[] args) {
        boolean infinateLoop= true;
        double[] accountBalance = new double[1000];//this array will contain the account balance 
        //Float = size 32bits ; double = size 64 bits
        String[] accountName = new String[1000] //this array contains the account holder's name
        while (infinateLoop) {
            System.out.println("Welcome to Codingal Banking Services");
            System.out.println("Banking Menu: ");
            System.out.println("Select any one of the below");
            System.out.println("1-> Add Customer");
            System.out.println("2-> Change Customer Name");
            System.out.println("3-> Check Account Balance");
            System.out.println("4-> Update Account Balacne");
            System.out.println("5-> Summary of all accounts");
            System.out.println("6-> Quit the Menu");

            Scanner sc = new Scanner(Sytem.in);
            System.out.println("Enter your option to proceed ahead: ");
            option = sc.nextInt();
            //insted of if we can even use switch
            option = sc.nextInt();
			//instead of if we can even use switch case here
            if (option == 1) {
                System.out.println("\nAdd Customer \nMenu->");

                sc.nextLine();

                System.out.print("\nEnter Customer Name: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.print("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account created successfully. \n");
                System.out.println("Account Details:- \n ");
                System.out.println("Account Number: " + (size));
                System.out.println("Account Name:" + accountName[size]);
                System.out.println("Account Balance: " + accountBalance[size] + " Rs \n");
				System.out.println("=================================");

                size = size + 1;

            } else if (option == 2) {

                System.out.println("\nChange Customer Name Menu");
                System.out.print("\nEnter your Account Number: ");

				//this is infact the logic of swapping
                int accountIndex;
                String temp;

                accountIndex = sc.nextInt();
                sc.nextLine();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    temp = accountName[accountIndex];
                    System.out.print("Enter the new name: ");
                    String name = sc.nextLine();
                    accountName[accountIndex] = name;
                    System.out.println("Name is successfully updated from " + temp + " to " + name + ". \n");
                }
			System.out.println("=================================");
            } else if (option == 3) {

                System.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.println(
                            accountName[accountIndex] + " your balance is " + accountBalance[accountIndex] + "Rs.");
                }
			System.out.println("=================================");
            } else if (option == 4) {

                System.out.println("\nUpdate Account Balance Menu ");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;
                accountIndex = sc.nextInt();

                if (accountIndex > size) {
                    System.out.println("Account does not exist.");
                    System.out.println("Terminating...");
                } else {
                    System.out.print("Enter the amount to be deposited: ");
                    double amt = sc.nextDouble();

                    accountBalance[accountIndex] += amt;
                    System.out.println(accountName[accountIndex] + " your updated balance is : "
                            + accountBalance[accountIndex] + " RS. \n ");
                }
			System.out.println("=================================");
            } else if (option == 5) {
				System.out.println("Accounts registered\n");

                for (int i = 100; i < size; i++) {
                    System.out.println("Account Number: " + i + ", Name: " + accountName[i] + ", Balance: "
                            + accountBalance[i] + "Rs. \n ");
                }
			System.out.println("=================================");
            } else if (option == 6) {

                System.out.println("Terminating...");
				System.out.println("Developed & Managed by Codingal");
				System.out.println("Built with ❤ in India");
                infiniteLoop=false; //instead of this "System.exit(0);" can also be used
            } else {

                System.out.println("\n Invalid input.");
                System.out.println("Terminating...");
				System.out.println("Developed & Managed by Codingal");
				System.out.println("Built with ❤ in India");
                System.exit(0);
            }
        }
    }
}