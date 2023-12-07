/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Student;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author M NJERIC
 */
public class StudentDao {
    
    public Student RegisterStudent(Student stdobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(stdobj);
            ss.beginTransaction().commit();
            ss.close();
            return stdobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    /////////////////////////////////////////////////
    public Student UpdateStudent(Student stdobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(stdobj);
            ss.beginTransaction().commit();
            ss.close();
            return stdobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Student DeleteStudent(Student stdobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(stdobj);
            ss.beginTransaction().commit();
            ss.close();
            return stdobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    public Student searching(Student stdobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Student datastudent=(Student) ss.get(Student.class,stdobj.getStudentId());
            return datastudent;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<Student> allstudentdata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Student> liststudent= ss.createQuery("select thestudent from Student thestudent").list();
            return liststudent;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
