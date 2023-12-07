/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Service.Implemantation.DeansearseImplemantation;
import Service.Implemantation.DeaprtmentServiceimplemantation;
import Service.Implemantation.FacultyserviceImplemantaion;
import Service.Implemantation.StudentServiceImplemantation;
import Service.Implemantation.courseserviseIMP;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author M NJERIC
 */
public class Server {
    public static void main(String[] args) {
    
          try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry regist=LocateRegistry.createRegistry(7000);
            regist.rebind("Deancall", new DeansearseImplemantation());
            regist.rebind("facultycall", new FacultyserviceImplemantaion());
            regist.rebind("Departmentcall", new DeaprtmentServiceimplemantation());
            regist.rebind("Studentcall", new StudentServiceImplemantation());
            regist.rebind("Coursecall", new courseserviseIMP());
            System.out.println("Server Is Ranning on Port 7000");
             Thread.currentThread().join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
        
        
    }
    
}
