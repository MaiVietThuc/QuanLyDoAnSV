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
public class GV_PBDT {
    private String MSGV;
    private String MSDT;
    private String DIEM;

    public GV_PBDT(String MSGV, String MSDT, String DIEM) {
        this.MSGV = MSGV;
        this.MSDT = MSDT;
        this.DIEM = DIEM;
    }

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
    }

    public String getMSDT() {
        return MSDT;
    }

    public void setMSDT(String MSDT) {
        this.MSDT = MSDT;
    }

    public String getDIEM() {
        return DIEM;
    }

    public void setDIEM(String DIEM) {
        this.DIEM = DIEM;
    }

    @Override
    public String toString() {
        return "GV_PBDT{" + "MSGV=" + MSGV + ", MSDT=" + MSDT + ", DIEM=" + DIEM + '}';
    }
    
    
}
