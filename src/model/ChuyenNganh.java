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
public class ChuyenNganh {
    private String MSCN;
    private String TENCN;

    public ChuyenNganh(String MSCN, String TENCN) {
        this.MSCN = MSCN;
        this.TENCN = TENCN;
    }

    public String getMSCN() {
        return MSCN;
    }

    public void setMSCN(String MSCN) {
        this.MSCN = MSCN;
    }

    public String getTENCN() {
        return TENCN;
    }

    public void setTENCN(String TENCN) {
        this.TENCN = TENCN;
    }

    @Override
    public String toString() {
        return "ChuyenNganh{" + "MSCN=" + MSCN + ", TENCN=" + TENCN + '}';
    }
    
    
}
