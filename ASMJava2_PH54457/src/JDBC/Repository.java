/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Student;
/**
 *
 * @author phamkhacthanh
 */
public class Repository {
    public String getRole (String username,String password){
        String sql = "select role from users\n" +
"where username = ? and password = ?";
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            String role="NO";
            while(rs.next()){
                role = rs.getString("role");
            }
            return role;
        } catch (Exception e) {
        }
        return "NO";
    }
    
    //quanlysinhvien
    
    public List<Student> getAllStudent(){
        String sql = """
                        select masv,hoten,email,sdt,gioitinh,diachi,hinhanh from student
                     """;
        List<Student> list = new ArrayList<>();
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Student st = new Student();
                st.setMa(rs.getString("ma"));
                st.setTen(rs.getString("ten"));
                st.setEmail(rs.getString("email"));
                st.setSdt(rs.getString("sdt"));
                st.setGioitinh(rs.getInt("gioitinh"));
                st.setDiachi(rs.getString("diachi"));
                st.setHinhAnh(rs.getString("hinhanh"));
                list.add(st);
            }
            return list;
        } catch (Exception e) {
            System.out.println("loi "+e);
            return null;
        }
    }
    
    public int themStudent (Student st){
        String sql = """
                    insert into student(masv,hoten,email,sdt,gioitinh,diachi,hinhanh)
                    values(?,?,?,?,?,?,?)
                     """;
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,st.getMa());
            ps.setString(2,st.getTen());
            ps.setString(3,st.getEmail());
            ps.setString(4,st.getSdt());
            ps.setInt(5,st.getGioitinh());
            ps.setString(6,st.getDiachi());
            ps.setString(7,st.getHinhAnh());
            int x = ps.executeUpdate();
            return x;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public int xoaStudent (Student st){
        String sql = """
                    delete from student
                    where masv = ?
                     """;
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,st.getMa());
            int x = ps.executeUpdate();
            return x;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    public int updateStudent (Student st){
        String sql = """
                    update student
                    set hoten = ?,email= ?,sdt= ?,gioitinh= ?,diachi= ?,hinhanh= ?
                     where masv = = ?
                     """;
        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,st.getTen());
            ps.setString(2,st.getEmail());
            ps.setString(3,st.getSdt());
            ps.setInt(4,st.getGioitinh());
            ps.setString(5,st.getDiachi());
            ps.setString(6,st.getHinhAnh());
            int x = ps.executeUpdate();
            return x;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
    
    
    public static void main(String[] args) {
        Repository repo = new Repository();
        System.out.println(repo.getRole("cbdt","cbdt123"));
    }
}
