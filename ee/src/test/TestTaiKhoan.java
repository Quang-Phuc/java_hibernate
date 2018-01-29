/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Aa;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;
import java.util.ArrayList;

/**
 *
 * @author KenhLapTrinh
 */
public class TestTaiKhoan {
    public static void main(String[] args) {
    	System.out.println(getA());

    }
    public static ArrayList<Aa> getA() {
    	Session session =HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction=session.beginTransaction();
        Query q=session.createQuery("from aa");
        transaction.commit();
        ArrayList<Aa> arr=(ArrayList<Aa>)q.list();
        return arr;
	}
}