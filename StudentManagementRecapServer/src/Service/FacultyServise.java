/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Dean;
import Model.Faculty;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public interface FacultyServise extends Remote{
    
    Faculty Registerdn(Faculty fucobj)throws RemoteException;
    Faculty updatedn(Faculty fucobj)throws RemoteException;
    Faculty deletedn(Faculty fucobj)throws RemoteException;
    Faculty searchingdn(Faculty fucobj)throws RemoteException;
    List<Faculty> deandata()throws RemoteException;
}
