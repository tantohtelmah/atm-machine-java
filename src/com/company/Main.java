package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static CharSequence transactions(){
        ArrayList<String> transact = new ArrayList<>();
        transact.add("withdraw cash");
        transact.add("deposit cash");
        transact.add("view balance");
        transact.add("change pin");
        transact.add("log in");
        return (CharSequence) transact;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome!");
        System.out.println("Are you new?");
        String answer = scanner.nextLine();
        AtmUser transcating = new AtmUser();
        if (answer.toLowerCase(Locale.ROOT).equals("yes")){
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Create pin:");
            int pin = scanner.nextInt();
            System.out.println("what is the cash type(FCFA, USD, ETHERUM...):");
            String cashtype = scanner.next();
            AtmUser newUser = new AtmUser(name,pin);
            System.out.println(newUser.toString());
            System.out.println("Successful creation of account!");
          //  AtmMachine newUserList = new AtmMachine(cashtype,newUser);


        }else if (answer.toLowerCase(Locale.ROOT).equals("no")){
            AtmMachine atmMachine = new AtmMachine();
          //  atmMachine.getNewUserList();
            System.out.println("what kind of transaction do you wish to perfrom?");
            String transaction = scanner.nextLine();

            if (transaction.equals("deposit cash")){
                System.out.println("Enter amount:");
                double newDeposit = scanner.nextDouble();
                transcating.depositCash(newDeposit);
                System.out.println("Deposited "+newDeposit);
            }
            if (transaction.equals("withdraw cash")){
                System.out.println("Enter cash to be withdrawn");
                double drawCash = scanner.nextDouble();
                transcating.withdrawCash(drawCash);
                System.out.println(transcating.getUserBalance());

            }
            if (transaction.equals("view balance")){
                System.out.println(transcating.getUserBalance());
            }
            if (transaction.equals("change pin")){
                System.out.println("Enter new pin");
                int newPin = scanner.nextInt();
                System.out.println(transcating.setUserPinCode(newPin));
                System.out.println("New pin added");
            }else System.out.println("Transaction does not exixt");
            //else System.out.println("Logged out");
        }
        else System.out.println("Sorry i dont understand");

    }
    }
