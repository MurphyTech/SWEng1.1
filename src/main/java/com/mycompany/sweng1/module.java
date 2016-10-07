/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sweng1;

import java.util.*;

/**
 *
 * @author David
 * @Date 23/09/2016
 */
public class module {
    private String Module_Name;
    private String Module_ID;
    private List<student> Students = new ArrayList<student>();
    
    public module(String modName, String id, List studentList){
        this.Module_Name = modName;
        this.Module_ID = id;
        this.Students = studentList;
    }
    
    public void setModule_Name(String name){
        Module_Name = name;
    }

    public String getModule_Name(){
        return this.Module_Name;
    }
    
    public void setModule_ID(String id){
        Module_ID = id;
    }

    public String getModule_ID(){
        return this.Module_ID;
    }
    
    public void addStudent(student newStudent){
        Students.add(newStudent);
    }
    
    public List<student> getStudentList(){
        return Students;
    }
    
}
