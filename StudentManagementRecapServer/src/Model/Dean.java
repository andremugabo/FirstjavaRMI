/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author M NJERIC
 */
@Entity
public class Dean implements  Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dean_id")
    private Integer deanId;
    private String name;
    @OneToOne(mappedBy = "dean")
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

   
    
}


