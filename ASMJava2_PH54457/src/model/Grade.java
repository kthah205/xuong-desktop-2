/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author phamkhacthanh
 */
public class Grade {
    private String ma;
    private String ten;
    private float diemTA;
    private float diemTin;
    private float diemGDTC;

    public Grade() {
    }

    public Grade(String ma, String ten, float diemTA, float diemTin, float diemGDTC) {
        this.ma = ma;
        this.ten = ten;
        this.diemTA = diemTA;
        this.diemTin = diemTin;
        this.diemGDTC = diemGDTC;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(float diemTA) {
        this.diemTA = diemTA;
    }

    public float getDiemTin() {
        return diemTin;
    }

    public void setDiemTin(float diemTin) {
        this.diemTin = diemTin;
    }

    public float getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(float diemGDTC) {
        this.diemGDTC = diemGDTC;
    }
    public float getdiemTB(){
        return (diemTA+diemTin+diemGDTC)/3;
    }
    public Object[] toRowTable(){
        return new Object[]{
            ma,ten,diemTA,diemTin,diemGDTC,getdiemTB()
        };
    }
}
