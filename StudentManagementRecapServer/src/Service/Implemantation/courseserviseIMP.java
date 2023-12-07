/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.CourseDao;
import Model.Course;
import Service.Courseservice;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public class courseserviseIMP extends UnicastRemoteObject implements Courseservice{

    public courseserviseIMP() throws RemoteException{
    }
    
    CourseDao dao=new CourseDao();

    @Override
    public Course Registerdn(Course couobj) throws RemoteException {
    return dao.RegisterCourse(couobj);
    }

    @Override
    public Course updatedn(Course couobj) throws RemoteException {
   return dao.UpdateCourse(couobj);
    }
    @Override
    public Course deletedn(Course couobj) throws RemoteException {
    return dao.DeleteCourse(couobj);
    }

    @Override
    public Course searchingdn(Course couobj) throws RemoteException {
   return dao.searching(couobj);
    }

    @Override
    public List<Course> deandata() throws RemoteException {
   return dao.coursealldata();
    }
    
    
    
    
}
