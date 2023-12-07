/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;


/**
 *
 * @author M NJERIC
 */

public class Dean implements  Serializable{
  public static final long serialVersionUID=-5002262805254223518L;
    private Integer deanId;
    private String name;
    private Faculty faculty;

    public Dean() {
    }

    public Dean(Integer deanId) {
        this.deanId = deanId;
    }

    public Dean(Integer deanId, String name, Faculty faculty) {
        this.deanId = deanId;
        this.name = name;
        this.faculty = faculty;
    }

    public Integer getDeanId() {
        return deanId;
    }

    public void setDeanId(Integer deanId) {
        this.deanId = deanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return name;
    }

   
    
}


