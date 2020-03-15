package com.mobiquity.assignment.data;

import com.mobiquity.assignment.testbase.TestBase;

public class Data extends TestBase {

    private String username;

    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }

    private String firstName;
    private String lastName;
    private String startDate;
    private String email;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getStartDate(){
        return startDate;
    }
    public String getEmail(){
        return email;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }
    public void setEmail(String email){
        this.email = email;
    }

}
