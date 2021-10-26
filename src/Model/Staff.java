/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.raven.swing.table.EventAction;
import com.raven.swing.table.ModelAction;
import com.raven.swing.table.ModelProfile;
import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class Staff {

 

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public String getDiachithuongtru() {
        return diachithuongtru;
    }

    public void setDiachithuongtru(String diachithuongtru) {
        this.diachithuongtru = diachithuongtru;
    }

    public String getTrinhdohocvan() {
        return trinhdohocvan;
    }

    public void setTrinhdohocvan(String trinhdohocvan) {
        this.trinhdohocvan = trinhdohocvan;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }



    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }
     private int id;
     private String hoten;
     private String gioitinh;
     private String noisinh;
     private String diachithuongtru;
     private String trinhdohocvan;
     private String chucvu;
 
     private String phongban;

    public String[] getKynang() {
        return kynang;
    }

    public void setKynang(String[] kynang) {
        this.kynang = kynang;
    }
     private String[] kynang;

    public Staff(int id, String hoten, String gioitinh, String noisinh, String diachithuongtru, String trinhdohocvan, String chucvu, String thoigianbatdauchucvu, String thoigiankeththucchucvu, String phongban, String[] kynang) {
        this.id = id;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.noisinh = noisinh;
        this.diachithuongtru = diachithuongtru;
        this.trinhdohocvan = trinhdohocvan;
        this.chucvu = chucvu;

        this.phongban = phongban;
        this.kynang = kynang;
    }
      
   
}
