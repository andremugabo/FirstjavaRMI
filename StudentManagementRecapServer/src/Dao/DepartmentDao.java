/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Department;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author M NJERIC
 */
public class DepartmentDao {
    
    public Department RegisterDepartment(Department depobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.save(depobj);
            ss.beginTransaction().commit();
            ss.close();
            return depobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    /////////////////////////////////////////////////
    public Department UpdateDepartment(Department depobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.update(depobj);
            ss.beginTransaction().commit();
            ss.close();
            return depobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    ////////////////////////////////
    public Department DeleteDepartment(Department depobj){
        
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            ss.delete(depobj);
            ss.beginTransaction().commit();
            ss.close();
            return depobj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        return null;
    }
    
    public Department searching(Department depobj){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            
            Department datadepartment=(Department) ss.get(Department.class,depobj.getDepId());
            return datadepartment;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
     public List<Department> allDepartmentdata(){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession(); 
            List<Department> listdepartment= ss.createQuery("select thedepartment from Department thedepartment").list();
            return listdepartment;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}
