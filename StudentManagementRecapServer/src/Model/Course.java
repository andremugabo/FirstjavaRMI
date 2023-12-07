/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author M NJERIC
 */
@Entity
public class Course implements  Serializable{
   
    @Id
    @Column(name="course_id")
    private String courseId;
    @Column(name="course_name")
    private String courseName;
    @ManyToMany(mappedBy = "courses")
    private Set<Student> students=new HashSet<>();

    public Course() {
    }

    public Course(String courseId) {
        this.courseId = courseId;
    }

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
        
}
