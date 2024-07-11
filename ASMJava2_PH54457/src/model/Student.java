/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author phamkhacthanh
 */
public class Student {
    private String ma;
    private String ten;
    private String email;
    private String sdt;
    private int gioitinh;
    private String diachi;
    private String hinhanh;

    public Student() {
    }

    public Student(String ma, String ten, String email, String sdt, int gioitinh, String diachi, String hinhanh) {
        this.ma = ma;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
        this.hinhanh = hinhanh;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public String getHinhAnh() {
        return hinhanh;
    }
    public void setHinhAnh(String hinhanh) {
        this.hinhanh = hinhanh;
    }
    
    public Object[] toRowTable(){
        return new Object[]{
            ma,ten,email,sdt,gioitinh == 1 ? "Nam":"Nữ",diachi,hinhanh
        };
    }
}
