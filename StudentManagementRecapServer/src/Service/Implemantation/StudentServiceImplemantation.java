/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implemantation;

import Dao.StudentDao;
import Model.Student;
import Service.StudentService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author M NJERIC
 */
public class StudentServiceImplemantation extends UnicastRemoteObject implements StudentService{

    public StudentServiceImplemantation() throws RemoteException{
    }
    StudentDao dao=new StudentDao();

    @Override
    public Student Registerdn(Student stdobj) throws RemoteException {
  return dao.RegisterStudent(stdobj);
    }

    @Override
    public Student updatedn(Student stdobj) throws RemoteException {
   return dao.UpdateStudent(stdobj);
    }

    @Override
    public Student deletedn(Student stdobj) throws RemoteException {
    return dao.DeleteStudent(stdobj);
    }

    @Override
    public Student searchingdn(Student stdobj) throws RemoteException {
   return dao.searching(stdobj);
    }

    @Override
    public List<Student> deandata() throws RemoteException {
    return dao.allstudentdata();
    }
    
    
}
