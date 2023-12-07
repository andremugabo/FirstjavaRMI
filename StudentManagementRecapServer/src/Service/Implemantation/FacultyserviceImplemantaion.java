/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.FacultyDao;
import Model.Faculty;
import Service.FacultyServise;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public class FacultyserviceImplemantaion extends UnicastRemoteObject implements FacultyServise{

    public FacultyserviceImplemantaion() throws RemoteException{
    }

    FacultyDao dao=new FacultyDao();
    @Override
    public Faculty Registerdn(Faculty fucobj) throws RemoteException {
   return dao.RegisterFaculty(fucobj);
    }

    @Override
    public Faculty updatedn(Faculty fucobj) throws RemoteException {
    return dao.UpdateFaculty(fucobj);
    
    }

    @Override
    public Faculty deletedn(Faculty fucobj) throws RemoteException {
   return dao.DeleteFaculty(fucobj);
    }

    @Override
    public Faculty searchingdn(Faculty fucobj) throws RemoteException {
  return dao.searching(fucobj);
    }

    @Override
    public List<Faculty> deandata() throws RemoteException {
    return dao.allfacultydata();
    }

    
}
