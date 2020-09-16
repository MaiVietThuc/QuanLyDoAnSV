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
public class HocVi {
    private String MSHV;
    private String TENHV;

    public HocVi(String MSHV, String TENHV) {
        this.MSHV = MSHV;
        this.TENHV = TENHV;
    }

    public String getMSHV() {
        return MSHV;
    }

    public void setMSHV(String MSHV) {
        this.MSHV = MSHV;
    }

    public String getTENHV() {
        return TENHV;
    }

    public void setTENHV(String TENHV) {
        this.TENHV = TENHV;
    }

    @Override
    public String toString() {
        return "HocVi{" + "MSHV=" + MSHV + ", TENHV=" + TENHV + '}';
    }
    
    
}
