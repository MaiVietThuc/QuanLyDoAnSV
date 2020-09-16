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
public class SV_DETAI {
    private String MSSV;
    private String TENSV;
    private String SODT;
    private String LOP;
    private String DIACHI;
    private String MSDT;
    private String TENDT;

    public SV_DETAI(String MSSV, String TENSV, String SODT, String LOP, String DIACHI, String MSDT, String TENDT) {
        this.MSSV = MSSV;
        this.TENSV = TENSV;
        this.SODT = SODT;
        this.LOP = LOP;
        this.DIACHI = DIACHI;
        this.MSDT = MSDT;
        this.TENDT = TENDT;
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

    public String getMSDT() {
        return MSDT;
    }

    public void setMSDT(String MSDT) {
        this.MSDT = MSDT;
    }

    public String getTENDT() {
        return TENDT;
    }

    public void setTENDT(String TENDT) {
        this.TENDT = TENDT;
    }

    @Override
    public String toString() {
        return "SV_DETAI{" + "MSSV=" + MSSV + ", TENSV=" + TENSV + ", SODT=" + SODT + ", LOP=" + LOP + ", DIACHI=" + DIACHI + ", MSDT=" + MSDT + ", TENDT=" + TENDT + '}';
    }

    
    
    
}
