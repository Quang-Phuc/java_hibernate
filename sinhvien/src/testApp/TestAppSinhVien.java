/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testApp;


import dao.SinhVienDAO;
import dao.SinhVienDAOImpl;
import model.SinhVien;
import java.util.List;
/**
 *
 * @authorkenhlaptrinh.net
 */
public class TestAppSinhVien {
    
    public static void main(String[] args) {
     /* Them 1 sinh vien moi 
      *  SinhVienDAO sinhVienDAO = new SinhVienDAOImpl();
        SinhVien sinhVien = new SinhVien();
        sinhVien.setHo_ten("Nguyễn Công Minh");
        sinhVien.setCmnd("291016657");
        sinhVien.setGioi_tinh(true);
        sinhVien.setTuoi(25);
        sinhVienDAO.add_sinhVien(sinhVien);
       */ 
        
    /*	Sua  sinh vien  co id = 1
        SinhVienDAO sinhVienDAO = new SinhVienDAOImpl();
        //load đối tượng sinh viên dựa vào id
        SinhVien sinhVien = sinhVienDAO.load_sinhVien(1);
        //cập nhật tuổi là 26
        sinhVien.setTuoi(28);
        //gọi phương thức update sinh viên
        sinhVienDAO.update_sinhVien(sinhVien);
       */ 
    	/* Xoa sinh vien
    	 *  SinhVienDAO sinhVienDAO = new SinhVienDAOImpl();
         //load đối tượng sinh viên dựa vào id
         SinhVien sinhVien = sinhVienDAO.load_sinhVien(1);
         //gọi phương thức delete sinh viên
         sinhVienDAO.delete_sinhVien(sinhVien);
    	*/
    	
    	SinhVienDAO sinhVienDAO = new SinhVienDAOImpl();
        //khởi tạo sinh viên thứ 1
        SinhVien sinhVien_1 = new SinhVien();
        sinhVien_1.setHo_ten("Nguyễn Công Minh");
        sinhVien_1.setGioi_tinh(true);
        sinhVien_1.setCmnd("291016444753");
        sinhVien_1.setTuoi(25);
        //khởi tạo sinh viên thứ 2
        SinhVien sinhVien_2 = new SinhVien();
        sinhVien_2.setHo_ten("Trương Tùng Dương");
        sinhVien_2.setGioi_tinh(true);
        sinhVien_2.setCmnd("216444753");
        sinhVien_2.setTuoi(24);
        //gọi phương thức thêm lần lượt hai đối tượng sinh viên
        sinhVienDAO.add_sinhVien(sinhVien_1);
        sinhVienDAO.add_sinhVien(sinhVien_2);
        //gọi phương thức load danh sách sinh viên
        List<SinhVien> list_sinhVien = sinhVienDAO.load_danhSachSinhVien();
        //vòng lặp for in ra từng phần tử có trong danh sách
        for(SinhVien sv : list_sinhVien){
            System.out.println("Họ tên :"+sv.getHo_ten()+" Tuổi :"+sv.getTuoi());
        }
        
    }
}
