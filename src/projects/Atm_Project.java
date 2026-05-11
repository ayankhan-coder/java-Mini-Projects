package projects;

import java.util.Scanner;

class Atm {

    private long accountNumber;
    private int pinCode;
    private double balance;
    private String accountHolder;
    private long mobileNumber;
    private String accountCreationDate;

    public Atm(String name, long accountNumber, int pinCode, double balance,
               long mobileNum, String accountCreationDate) {

        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.accountHolder = name;
        this.mobileNumber = mobileNum;
        this.accountCreationDate = accountCreationDate;
    }

    public boolean login(long accNo, int pin) {
        return this.accountNumber == accNo && this.pinCode == pin;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            return true;
        }
        return false;
    }

    public boolean withDraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public void getAccountInfo() {
        System.out.println(" ~~ practice.Account Holder    : " + accountHolder);
        System.out.println(" ~~ practice.Account Number    : " + accountNumber);
        System.out.println(" ~~ Mobile Number     : " + mobileNumber);
        System.out.println(" ~~ practice.Account Created On : " + accountCreationDate);
    }
}
public class Atm_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Atm atm = new Atm("Ayan Khan", 1234567890l, 1234, 5000,
                9620868617l, "10/03/2026");

        boolean found = false;

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter practice.Account Number : ");
            long enterAccNo = sc.nextLong();

            System.out.print("Enter Pin : ");
            int enterPin = sc.nextInt();

            if (atm.login(enterAccNo, enterPin)) {

                System.out.println("WelCome to Your practice.Account");
                found = true;

                int enterOption = 0;

                while (enterOption != 5) {

                    System.out.println("1: Balance");
                    System.out.println("2: Deposit");
                    System.out.println("3: WithDraw");
                    System.out.println("4: practice.Account Information");
                    System.out.println("5: Exit");
                    System.out.println("\t Enter An Option --");

                    enterOption = sc.nextInt();

                    switch (enterOption) {

                        case 1:
                            System.out.println(atm.getBalance());
                            break;

                        case 2:
                            System.out.print("Enter Amount To Deposit : ");
                            int enterDepositMoney = sc.nextInt();

                            if (atm.deposit(enterDepositMoney)) {
                                System.out.println("Deposit Successful");
                                System.out.println("Current Balance : " + atm.getBalance());
                            } else {
                                System.out.println("Invalid Amount");
                            }
                            break;

                        case 3:
                            System.out.print("Enter Amount To WithDraw : ");
                            int enterAmount = sc.nextInt();

                            if (atm.withDraw(enterAmount)) {
                                System.out.println("WithDraw Successful");
                                System.out.println("Current Balance : " + atm.getBalance());
                            } else {
                                System.out.println("Invalid Balance");
                            }
                            break;

                        case 4:
                            atm.getAccountInfo();
                            break;

                        case 5:
                            System.out.println(" ~~ THANK-YOU  VISIT AGAIN ...");
                            break;

                        default:
                            System.out.println("Invalid Option *^$# ");
                    }
                }

                break;

            } else {
                System.out.println("Invalid Information");
            }
        }

        if (!found) {
            System.out.println("Too many failed attempts");
        }

    }
}
