/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author M NJERIC
 */

public class Department implements  Serializable {
  public static final long serialVersionUID = -1259699134683370584L;
    private Integer depId;
    private String depName;
    private Faculty faculty;
    private List<Student> students=new  ArrayList<>();

    public Department() {
    }

    public Department(Integer depId) {
        this.depId = depId;
    }

    public Department(Integer depId, String depName, Faculty faculty) {
        this.depId = depId;
        this.depName = depName;
        this.faculty = faculty;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return depName;
    }

   

 
    
    
    
}
