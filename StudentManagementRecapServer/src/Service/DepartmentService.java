/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Department;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public interface DepartmentService extends Remote{
    Department  Registerdn(Department  depobj)throws RemoteException;
    Department  updatedn(Department  depobj)throws RemoteException;
    Department  deletedn(Department  depobj)throws RemoteException;
    Department  searchingdn(Department depobj)throws RemoteException;
    List<Department> deandata()throws RemoteException;
    
}
