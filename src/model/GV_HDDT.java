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
public class GV_HDDT {
    private String msgv;
    private String msdt;
    private int diem;

    public GV_HDDT(String msgv, String msdt, int diem) {
        this.msgv = msgv;
        this.msdt = msdt;
        this.diem = diem;
    }

    public String getMsgv() {
        return msgv;
    }

    public void setMsgv(String msgv) {
        this.msgv = msgv;
    }

    public String getMsdt() {
        return msdt;
    }

    public void setMsdt(String msdt) {
        this.msdt = msdt;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "GV_HDDT{" + "msgv=" + msgv + ", msdt=" + msdt + ", diem=" + diem + '}';
    }
    
}
