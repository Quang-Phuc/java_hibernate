/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author kenhlaptrinh.net
 */
@Entity(name = "sinh_vien")
public class SinhVien implements Serializable {
    @Id
    @GeneratedValue
    private long id_sinh_vien;
    private String ho_ten;
    private String cmnd;
    private int tuoi;
    private boolean gioi_tinh;

    public long getId_sinh_vien() {
        return id_sinh_vien;
    }

    public void setId_sinh_vien(long id_sinh_vien) {
        this.id_sinh_vien = id_sinh_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(boolean gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ho_ten=" + ho_ten + '}';
    } 
    
}