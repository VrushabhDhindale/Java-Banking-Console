import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice;
        boolean isCodeRunning = true;
        double bankbalance = 0;
        String options = """
                1. Show Balance
                2. Deposit
                3. WithDraw
                4. Exit
                """;

        while(isCodeRunning == true){

            System.out.println();
            System.out.println("*********************");
            System.out.println("Banking program : ");
            System.out.println("*********************");
            System.out.println(
                    "1. Show Balance\n" +
                    "2. Deposit\n" +
                    "3. WithDraw\n" +
                    "4. Exit");
            System.out.println("*********************");

            System.out.print("Enter the option between (1-4) : ");
            choice = sc.nextInt();

            switch (choice){

                case 1 -> ShowBalance(bankbalance);
                case 2 -> bankbalance += deposit(sc);
                case 3 -> bankbalance -= withDraw(sc,bankbalance);
                case 4 -> {
                    exit();
                    isCodeRunning = false;
                }
                default -> System.out.println("Pleas4" +
                        "e enter the valid options! \n");


            }

        }

    }

    static void ShowBalance(double balance){

        System.out.println("Bank Balance :  " + balance);

    }

    static double deposit(Scanner sc){

        double amount;

        System.out.print("Enter the amount you want to deposit : ");
        amount = sc.nextDouble();

        if (amount <= 0){

            System.out.println("The Deposit amount cannot be zero or negative! \n");
            return 0;

        } else{

            System.out.printf("%.2f amount deposited successfull! \n", amount);
            return amount;

        }

    }

    static double withDraw(Scanner sc, double balance){

        double amount;

        System.out.print("Enter the amount you want to WithDraw : ");
        amount = sc.nextInt();

        if (amount <= 0){

            System.out.println("The Withdraw amount cannot be zero or negative!");
            return 0;

        } else if (amount > balance){

            System.out.printf("%.2f amount is not avaliable in the account ! please check the Bank Balance !", amount);
            return 0;

        } else {

            System.out.printf("%.2f amount is withdraw from the account", amount);
            return amount;

        }

    }

    static void exit(){


        System.out.println("Thank you for using our services !");

    }

}