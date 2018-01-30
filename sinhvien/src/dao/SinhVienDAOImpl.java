/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.SinhVien;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

/**
 *
 * @author kenhlaptrinh.net
 */
public class SinhVienDAOImpl implements SinhVienDAO{
    int seriable = 0;

    // thêm sinh viên
    @Override
    public void add_sinhVien(SinhVien sinhVien){
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(sinhVien);
        transaction.commit();
    }
    
    // sửa sinh viên
    @Override
    public void update_sinhVien(SinhVien sinhVien){
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(sinhVien);
        transaction.commit();
    }
    
    // xóa sinh viên
    @Override
    public void delete_sinhVien(SinhVien sinhVien){
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(sinhVien);
        transaction.commit();
    }
    
    // load sinh vien   
    @Override
    public SinhVien load_sinhVien(long id_Sinh_vien) {
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        SinhVien sinhVien = (SinhVien) session.get(SinhVien.class, id_Sinh_vien);
        transaction.commit();
        return sinhVien;
    }
    
    // load danh sách sinh viên
    @Override
    public List<SinhVien> load_danhSachSinhVien(){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        String hql ="from sinh_vien";
        Query query = session.createQuery(hql);
        List<SinhVien> list_sinhVien = query.list();
        transaction.commit();
        return list_sinhVien;
    }

}