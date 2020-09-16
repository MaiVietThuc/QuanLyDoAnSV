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
public class GiaoVien {
    private String msgv;
    private String tengv;
    private String diachi;
    private String sodt;
    private String mshham;
    private String namhh;

    public GiaoVien(String msgv, String tengv, String diachi, String sodt, String mshham, String namhh) {
        this.msgv = msgv;
        this.tengv = tengv;
        this.diachi = diachi;
        this.sodt = sodt;
        this.mshham = mshham;
        this.namhh = namhh;
    }

    
    
    public String getMsgv() {
        return msgv;
    }

    public void setMsgv(String msgv) {
        this.msgv = msgv;
    }

    public String getTengv() {
        return tengv;
    }

    public void setTengv(String tengv) {
        this.tengv = tengv;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getMshham() {
        return mshham;
    }

    public void setMshham(String mshham) {
        this.mshham = mshham;
    }

    public String getNamhh() {
        return namhh;
    }

    public void setNamhh(String namhh) {
        this.namhh = namhh;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "msgv=" + msgv + ", tengv=" + tengv + ", diachi=" + diachi + ", sodt=" + sodt + ", mshham=" + mshham + ", namhh=" + namhh + '}';
    }
    
    
}
