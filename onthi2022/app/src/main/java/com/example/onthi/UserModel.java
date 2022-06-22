package com.example.onthi;

public class UserModel {
    long ID;
    String username,phone,email;
    public UserModel(){

    }
    public UserModel(int ID, String username, String phone, String email){
        this.ID = ID;
        this.username = username;
        this.phone = phone;
        this.email = email;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUserphone() {
        return phone;
    }

    public void setUserphone(String phone) {
        this.phone = phone;
    }
    public String getUseremail() {
        return email;
    }

    public void setUseremail(String email) {
        this.email = email;
    }

}
