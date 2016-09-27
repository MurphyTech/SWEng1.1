/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sweng1;

import java.util.*;
import org.joda.time.*;

/**
 *
 * @author David
 * @Date 23/09/2016
 */
public class course_programme {
    private String Course_Name;
    private List<module> Modules = new ArrayList<module>();
    private LocalDate Start_Date;
    private LocalDate End_Date;
    
    public void setCourse_Name(String name){
        Course_Name = name;
    }

    public String getCourse_Name(){
        return this.Course_Name;
    }
    
    public void addModule(module newModule){
        Modules.add(newModule);
    }
    
    public List<module> getModuleList(){
        return Modules;
    }
    
    public void setStart_Date(LocalDate date){
        Start_Date = date;
    }
    
    public LocalDate getStart_Date(){
        return this.Start_Date;
    }
    
    public void setEnd_Date(LocalDate date){
        End_Date = date;
    }
    
    public LocalDate getEnd_Date(){
        return this.End_Date;
    }
    
}
