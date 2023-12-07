/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Course;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public interface Courseservice extends Remote{
    Course Registerdn(Course couobj)throws RemoteException;
    Course updatedn(Course couobj)throws RemoteException;
    Course deletedn(Course couobj)throws RemoteException;
    Course searchingdn(Course couobj)throws RemoteException;
    List<Course> deandata()throws RemoteException;
    
}
