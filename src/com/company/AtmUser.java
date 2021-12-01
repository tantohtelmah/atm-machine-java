package com.company;

public class AtmUser {
    private String userName;
    private int userPinCode;
    private double userBalance;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPinCode() {
        return userPinCode;
    }

    public boolean setUserPinCode(int userPinCode) {
        this.userPinCode = userPinCode;
        return true;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userbalance();
    }

    public AtmUser(String userName, int userPinCode, double userBalance) {
        this.userName = userName;
        this.userPinCode = userPinCode;
        this.userBalance = userBalance;
    }
    public AtmUser(String userName, int userPinCode) {
        this.userName = userName;
        this.userPinCode = userPinCode;
        this.userBalance = userBalance;
    }
    public AtmUser() {
        this.userName = userName;
        this.userPinCode = userPinCode;
        this.userBalance = userBalance;
    }
    static double depositCash(double newDeposit){
        double deposit = 0.0;
        deposit += newDeposit;
        return deposit;
    }
    static double withdrawCash(double cash){
        double withdrawal = 0.0;
        withdrawal = userbalance() - cash;
        return withdrawal;
    }
    static double userbalance(){
        double balance = 0.0;
     //   balance = depositCash() - withdrawCash();
        System.out.println(balance);
        return balance;
    }
    @Override
    public String toString(){
        return "Name: "+this.getUserName()+"\n"+
                "Pin Code: "+this.getUserPinCode();
    }
}
