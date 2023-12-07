/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.DeanDao;
import Model.Dean;
import Service.Deanservise;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public class DeansearseImplemantation extends UnicastRemoteObject implements Deanservise{

    public DeansearseImplemantation() throws RemoteException{
    }
 
    DeanDao dao=new DeanDao();
    
    @Override
    public Dean Registerdn(Dean dnobj) throws RemoteException {
   
    return dao.RegisterDean(dnobj);
            }

    @Override
    public Dean updatedn(Dean dnobj) throws RemoteException {
   return dao.UpdateDean(dnobj);
    }

    @Override
    public Dean deletedn(Dean dnobj) throws RemoteException {
    return dao.DeleteDean(dnobj);
    }

    @Override
    public Dean searchingdn(Dean dnobj) throws RemoteException {
    return dao.searching(dnobj);
    }

    @Override
    public List<Dean> deandata() throws RemoteException {
    return dao.allDean();
    }
    
    
}
