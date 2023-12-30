package com.mapping.MedicalManagement;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Medicine m1 = new Medicine();
        Medicine m2 = new Medicine();
        Medicine m3 = new Medicine();
         
        m1.setMid(7);
        m1.setMname("Sinarest");
        
        m2.setMid(2);
        m2.setMname("Dolo");
        
        m3.setMid(20);
        m3.setMname("Clavam 625");
        
        Distributor d1 = new Distributor();
        Distributor d2 = new Distributor();
        
        d1.setDid(1212);
        d1.setDname("Arihant Distributor");
        
        d2.setDid(7676);
        d2.setDname("BH Pharma");
        
        List<Medicine> list1 = new ArrayList<Medicine>();
        List<Distributor> list2 = new ArrayList<Distributor>();
        
        list1.add(m1);
        list1.add(m2);
        list1.add(m3);
        
        list2.add(d1);
        list2.add(d2);
        
        m1.setDistributors(list2);
        m2.setDistributors(list2);
        d1.setMedicines(list1);
        
        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
       s.save(m1);
       s.save(m2);
       s.save(m3);
       s.save(d1);
       s.save(d2);
        
        tx.commit();
        s.close();
   	 factory.close();
        
    }
}
