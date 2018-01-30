/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.SinhVien;

/**
 *
 * @author kenhlaptrinh.net
 */
public interface SinhVienDAO {

    public void add_sinhVien(SinhVien sinhVien);

    public void update_sinhVien(SinhVien sinhVien);

    public void delete_sinhVien(SinhVien sinhVien);
    
    public SinhVien load_sinhVien(long id_Sinh_vien);

    public List<SinhVien> load_danhSachSinhVien();
}