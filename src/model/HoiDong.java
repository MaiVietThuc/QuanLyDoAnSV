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
public class HoiDong {
    private String MSHD;
    private String PHONG;
    private String TGBD;
    private String NGAYHD;
    private String TINHTRANG;
    private String MSGVCTHD;

    public HoiDong(String MSHD, String PHONG, String TGBD, String NGAYHD, String TINHTRANG, String MSGVCTHD) {
        this.MSHD = MSHD;
        this.PHONG = PHONG;
        this.TGBD = TGBD;
        this.NGAYHD = NGAYHD;
        this.TINHTRANG = TINHTRANG;
        this.MSGVCTHD = MSGVCTHD;
    }

    public String getMSHD() {
        return MSHD;
    }

    public void setMSHD(String MSHD) {
        this.MSHD = MSHD;
    }

    public String getPHONG() {
        return PHONG;
    }

    public void setPHONG(String PHONG) {
        this.PHONG = PHONG;
    }

    public String getTGBD() {
        return TGBD;
    }

    public void setTGBD(String TGBD) {
        this.TGBD = TGBD;
    }

    public String getNGAYHD() {
        return NGAYHD;
    }

    public void setNGAYHD(String NGAYHD) {
        this.NGAYHD = NGAYHD;
    }

    public String getTINHTRANG() {
        return TINHTRANG;
    }

    public void setTINHTRANG(String TINHTRANG) {
        this.TINHTRANG = TINHTRANG;
    }

    public String getMSGVCTHD() {
        return MSGVCTHD;
    }

    public void setMSGVCTHD(String MSGVCTHD) {
        this.MSGVCTHD = MSGVCTHD;
    }

    @Override
    public String toString() {
        return "HoiDong{" + "MSHD=" + MSHD + ", PHONG=" + PHONG + ", TGBD=" + TGBD + ", NGAYHD=" + NGAYHD + ", TINHTRANG=" + TINHTRANG + ", MSGVCTHD=" + MSGVCTHD + '}';
    }
    
    
}
