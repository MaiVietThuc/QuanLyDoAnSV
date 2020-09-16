/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class SinhVien {
    private String MSSV;
    private String TENSV;
    private String SODT;
    private String LOP;
    private String DIACHI;

    public SinhVien(String MSSV, String TENSV, String SODT, String LOP, String DIACHI) {
        this.MSSV = MSSV;
        this.TENSV = TENSV;
        this.SODT = SODT;
        this.LOP = LOP;
        this.DIACHI = DIACHI;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getTENSV() {
        return TENSV;
    }

    public void setTENSV(String TENSV) {
        this.TENSV = TENSV;
    }

    public String getSODT() {
        return SODT;
    }

    public void setSODT(String SODT) {
        this.SODT = SODT;
    }

    public String getLOP() {
        return LOP;
    }

    public void setLOP(String LOP) {
        this.LOP = LOP;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "MSSV=" + MSSV + ", TENSV=" + TENSV + ", SODT=" + SODT + ", LOP=" + LOP + ", DIACHI=" + DIACHI + '}';
    }
    
    
}
