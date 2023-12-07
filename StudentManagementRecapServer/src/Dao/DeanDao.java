/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Dean;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author M NJERIC
 */
public class DeanDao {
    
    public Dean RegisterDean(Dean dnobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(dnobj);
            ss.beginTransaction().commit();
            ss.close();
            return dnobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    /////////////////////////////////////////////////
    public Dean UpdateDean(Dean dnobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(dnobj);
            ss.beginTransaction().commit();
            ss.close();
            return dnobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Dean DeleteDean(Dean dnobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(dnobj);
            ss.beginTransaction().commit();
            ss.close();
            return dnobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    public Dean searching(Dean dnobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Dean datadean=(Dean) ss.get(Dean.class,dnobj.getDeanId());
            return datadean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<Dean> allDean(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Dean> listdean= ss.createQuery("select thedean from Dean thedean").list();
            return listdean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
