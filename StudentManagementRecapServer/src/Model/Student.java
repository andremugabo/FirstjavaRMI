/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author M NJERIC
 */
@Entity
public class Student implements  Serializable {
    @Id
    @Column(name = "student_id")
    private String studentId;
    private String names;
    @ManyToOne
    @JoinColumn(name="dep_id")
    private  Department department;
    @ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    
    )
    private Set<Course> courses;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
    
    
    
}
