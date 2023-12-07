/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Dean;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public interface Deanservise extends Remote{
    
    Dean Registerdn(Dean dnobj)throws RemoteException;
    Dean updatedn(Dean dnobj)throws RemoteException;
    Dean deletedn(Dean dnobj)throws RemoteException;
    Dean searchingdn(Dean dnobj)throws RemoteException;
    List<Dean> deandata()throws RemoteException;
    
}
