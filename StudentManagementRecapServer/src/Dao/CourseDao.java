/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Course;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author M NJERIC
 */
public class CourseDao {
    
    public Course RegisterCourse(Course couobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(couobj);
            ss.beginTransaction().commit();
            ss.close();
            return couobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    /////////////////////////////////////////////////
    public Course UpdateCourse(Course couobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(couobj);
            ss.beginTransaction().commit();
            ss.close();
            return couobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Course DeleteCourse(Course couobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(couobj);
            ss.beginTransaction().commit();
            ss.close();
            return couobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    public Course searching(Course couobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Course datacourse=(Course) ss.get(Course.class,couobj.getCourseId());
            return datacourse;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<Course> coursealldata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Course> listcourse= ss.createQuery("select thecourse from Course thecourse").list();
            return listcourse;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
