/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sweng1;

/**
 *
 * @author David
 * @Date 23/09/2016
 */
public class student {
    private String Name;
    private int Age;
    private String Birthdate;
    private String UserName;
    
    public student(String name, int age, String dob){
        this.Name = name;
        this.Age = age;
        this.Birthdate = dob;
        genUserName();
    }
    
    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return this.Name;
    }
    
    public void setAge(int age){
        Age = age;
    }
    public int getAge(){
        return this.Age;
    }
    
    public void setDOB(String dob){
        Birthdate = dob;
    }
    
    public String getDOB(){
        return this.Birthdate;
    }
    
    public void genUserName(){
        UserName = (Name + Age);
    }
    
    public String getUserName(){
        return this.UserName;
    }
    
}
