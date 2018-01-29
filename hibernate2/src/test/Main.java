/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.management.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import antlr.collections.List;
import model.Employee;
import util.HibernateUtil;
import java.util.ArrayList;

/**
 *
 * @author KenhLapTrinh
 */
public class Main {
    public static void main(String[] args) {
        Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Employee employee=new Employee();
      int salary=1;
      Employee employee2=(Employee)session.get(Employee.class,salary);
  if (employee2 !=null)
      {
    	  System.out.println("Thong tin : "+employee2.toString());
      }
      else
      {
    	  System.out.println("Thong tin co id =:"+salary+"Khong ton tai");
      }
 
//      String hql= "from employee";
      
     // String hql = "FROM Employee E WHERE E.id = 10";
    //  Query query = session.createQuery(hql);
     // List results = query.list();

      
    }
}