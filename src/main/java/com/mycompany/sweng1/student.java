/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sweng1;

import org.joda.time.*;

/**
 *
 * @author David
 * @Date 23/09/2016
 */
public class student {
    private String Name;
    private Years Age;
    private LocalDate Birthdate;
    private LocalDate now = new LocalDate();
    private String UserName;
    
    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return this.Name;
    }
    
    public void setAge(Years age){
        Age = age;
    }
    public Years getAge(){
        return this.Age;
    }
    
    public void setDOB(LocalDate dob){
        Birthdate = dob;
        Years CurAge = Years.yearsBetween(Birthdate, now);
        setAge(CurAge);
    }
    
    public LocalDate getDOB(){
        return this.Birthdate;
    }
    
    public void genUserName(){
        UserName = Name + Age;
    }
    
    public String getUserName(){
        return this.UserName;
    }
    
}
