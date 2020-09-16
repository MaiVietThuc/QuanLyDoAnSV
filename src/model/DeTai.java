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
public class DeTai {
    private String MSDT;
    private String TENDT;

    public DeTai(String MSDT, String TENDT) {
        this.MSDT = MSDT;
        this.TENDT = TENDT;
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
        return  MSDT +  TENDT ;}
    }

    
