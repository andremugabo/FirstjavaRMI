/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Faculty;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author M NJERIC
 */
public class FacultyDao {
    
    public Faculty RegisterFaculty(Faculty facobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(facobj);
            ss.beginTransaction().commit();
            ss.close();
            return facobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    /////////////////////////////////////////////////
    public Faculty UpdateFaculty(Faculty facobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(facobj);
            ss.beginTransaction().commit();
            ss.close();
            return facobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Faculty DeleteFaculty(Faculty facobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(facobj);
            ss.beginTransaction().commit();
            ss.close();
            return facobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    public Faculty searching(Faculty facobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Faculty datafaculty=(Faculty) ss.get(Faculty.class,facobj.getFacId());
            return datafaculty;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<Faculty> allfacultydata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Faculty> listfaculty= ss.createQuery("select thefaculty from Faculty thefaculty").list();
            return listfaculty;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
