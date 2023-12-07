/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

/**
 *
 * @author M NJERIC
 */
@Entity
public class Faculty implements  Serializable {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fac_id")
    private Integer facId;
    @Column(name = "fac_name")
    private String facname;
    @OneToOne
    @JoinColumn(name = "dean_id")
    private Dean dean;
    @OneToMany(mappedBy = "faculty")
    List<Department> deaprtments= new ArrayList<>();

    public Faculty() {
    }

    public Faculty(Integer facId) {
        this.facId = facId;
    }

    public Faculty(Integer facId, String facname, Dean dean) {
        this.facId = facId;
        this.facname = facname;
        this.dean = dean;
    }

    public Integer getFacId() {
        return facId;
    }

    public void setFacId(Integer facId) {
        this.facId = facId;
    }

    public String getFacname() {
        return facname;
    }

    public void setFacname(String facname) {
        this.facname = facname;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public List<Department> getDeaprtments() {
        return deaprtments;
    }

    public void setDeaprtments(List<Department> deaprtments) {
        this.deaprtments = deaprtments;
    }
    
    
}
