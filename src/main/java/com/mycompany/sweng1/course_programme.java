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
    
    public course_programme(String CourseName, List moduleList, LocalDate start, LocalDate end){
        this.Course_Name = CourseName;
        this.Modules = moduleList;
        this.Start_Date = start;
        this.End_Date = end;
    }    
    
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
    
    public void printINFO(){
        List<student> StudentsList = new ArrayList<student>();
        
        List<module> ModulesList = new ArrayList<module>();
        ModulesList = this.getModuleList();
         for (int i =0; i<ModulesList.size(); i++){
            module mod = ModulesList.get(i);
            System.out.println("Module: " + mod.getModule_Name() + " | " + mod.getModule_ID());
            List<student> ModStudents = new ArrayList<student>();
            ModStudents = mod.getStudentList();
            for (int j=0; j<ModStudents.size(); j++){
                student s = ModStudents.get(j);
                
                System.out.println(s.getName());
                
            }
         }
    }
}
