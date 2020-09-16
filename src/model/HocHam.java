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
public class HocHam {
    private String MSHH;
    private String TENHH;

    public HocHam(String MSHH, String TENHH) {
        this.MSHH = MSHH;
        this.TENHH = TENHH;
    }

    public String getMSHH() {
        return MSHH;
    }

    public void setMSHH(String MSHH) {
        this.MSHH = MSHH;
    }

    public String getTENHH() {
        return TENHH;
    }

    public void setTENHH(String TENHH) {
        this.TENHH = TENHH;
    }

    @Override
    public String toString() {
        return "HocHam{" + "MSHH=" + MSHH + ", TENHH=" + TENHH + '}';
    }
    
    
}
