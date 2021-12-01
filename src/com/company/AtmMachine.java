package com.company;

import java.util.ArrayList;

public class AtmMachine {
    private String cashType;
    private AtmUser newUser;
  //  private ArrayList<AtmUser> newUserList;

    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
    }

    public AtmUser getNewUser() {
        return newUser;
    }

    public void setNewUser(AtmUser newUser) {
        this.newUser = newUser;
    }
   // public ArrayList<AtmUser> getNewUserList() {
   //     return newUserList;
  //  }

    //public void setNewUserList(ArrayList<AtmUser> newUserList) {
    //    this.newUserList = newUserList;
  //  }
   // public void logOutUser(){
   //     this.getNewUserList().clear();
   // }

    public AtmMachine(String cashType, AtmUser newUser) {
        this.cashType = cashType;
       // this.newUserList = newUserList;
        this.newUser = newUser;
       // newUserList.add(newUser);

    }
    public AtmMachine() {
        this.cashType = cashType;
       // this.newUserList = newUserList;
        this.newUser = newUser;
       // newUserList.add(this.newUser);
    }

}
