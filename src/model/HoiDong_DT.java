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
public class HoiDong_DT {
    private String MSHD;
    private String MSDT;
    private String QUYETDINH;

    public HoiDong_DT(String MSHD, String MSDT, String QUYETDINH) {
        this.MSHD = MSHD;
        this.MSDT = MSDT;
        this.QUYETDINH = QUYETDINH;
    }

    public String getMSHD() {
        return MSHD;
    }

    public void setMSHD(String MSHD) {
        this.MSHD = MSHD;
    }

    public String getMSDT() {
        return MSDT;
    }

    public void setMSDT(String MSDT) {
        this.MSDT = MSDT;
    }

    public String getQUYETDINH() {
        return QUYETDINH;
    }

    public void setQUYETDINH(String QUYETDINH) {
        this.QUYETDINH = QUYETDINH;
    }

    @Override
    public String toString() {
        return "HoiDong_DT{" + "MSHD=" + MSHD + ", MSDT=" + MSDT + ", QUYETDINH=" + QUYETDINH + '}';
    }
    
    
}
