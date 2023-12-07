/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.DepartmentDao;
import Model.Department;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import Service.DepartmentService;

/**
 *
 * @author M NJERIC
 */
public class DeaprtmentServiceimplemantation extends UnicastRemoteObject implements DepartmentService{

    public DeaprtmentServiceimplemantation() throws RemoteException{
    }

    DepartmentDao dao=new DepartmentDao();
    
    @Override
    public Department Registerdn(Department depobj) throws RemoteException {
  return dao.RegisterDepartment(depobj);
    }

    @Override
    public Department updatedn(Department depobj) throws RemoteException {
    return dao.UpdateDepartment(depobj);
    }

    @Override
    public Department deletedn(Department depobj) throws RemoteException {
   return dao.DeleteDepartment(depobj);
    }

    @Override
    public Department searchingdn(Department depobj) throws RemoteException {
   return dao.searching(depobj);
    }

    @Override
    public List<Department> deandata() throws RemoteException {
   
    return dao.allDepartmentdata();
            }
    
    
}
