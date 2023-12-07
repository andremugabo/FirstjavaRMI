/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Student;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


/**
 *
 * @author M NJERIC
 */
public interface StudentService extends Remote{

    Student Registerdn(Student stdobj)throws RemoteException;
    Student updatedn(Student stdobj)throws RemoteException;
    Student deletedn(Student stdobj)throws RemoteException;
    Student searchingdn(Student stdobj)throws RemoteException;
    List<Student> deandata()throws RemoteException;
}
