package DAO;

import DTO.SinhVienDTO;

import java.sql.*;
import java.util.ArrayList;

public class SinhVienDAO {
    // Query thêm thông tin sinh viên
    public boolean insert(SinhVienDTO studentDTO) throws Exception {
        String sql = "insert into dbo.SinhVien(MaSV, HoTen, Email, SDT, GioiTinh, DiaChi) values(?,?,?,?,?,?)";
        // sử dụng try-with-resources
        try (
                Connection conn = _ConnectionDatabase.openConnection();
                PreparedStatement pstm = conn.prepareStatement(sql);
             ){
            pstm.setString(1, studentDTO.getID());
            pstm.setString(2, studentDTO.getFullname());
            pstm.setString(3, studentDTO.getEmail());
            pstm.setString(4, studentDTO.getPhoneNumber());
            pstm.setInt(5, studentDTO.getSex());
            pstm.setString(6, studentDTO.getAddress());

            return pstm.executeUpdate() > 0;
        }
    }

    // Query tìm theo mã số sinh viên => trả về đối tượng SinhVien chứa thông tin trùng với mã
    public SinhVienDTO findSinhVienById(String maSV) throws Exception {
        String sql = "select * from dbo.SinhVien where MaSV = ?";
        // sử dụng try-with-resources
        try (
                Connection conn = _ConnectionDatabase.openConnection();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ){
            pstm.setString(1, maSV);

            ResultSet rs = pstm.executeQuery();
            if(rs.next()) {
                SinhVienDTO sinhVienDTO = new SinhVienDTO();
                sinhVienDTO.setID(rs.getString("MaSV").trim());
                sinhVienDTO.setFullname(rs.getString("HoTen").trim());
                sinhVienDTO.setEmail(rs.getString("Email").trim());
                sinhVienDTO.setPhoneNumber(rs.getString("SDT").trim());
                sinhVienDTO.setSex(rs.getInt("GioiTinh"));
                sinhVienDTO.setAddress(rs.getString("DiaChi").trim());

                return sinhVienDTO;
            }
            return null;
        }
    }

    // Query cập nhật theo mã số sinh viên => cập nhật thông tin sinh viên
    public boolean update(SinhVienDTO studentDTO) throws Exception {
        String sql = "update dbo.SinhVien set HoTen = ?, Email = ?, SDT = ?, GioiTinh = ?, DiaChi = ? where MaSV = ?";
        // sử dụng try-with-resources
        try (
                Connection conn = _ConnectionDatabase.openConnection();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ){
            pstm.setString(1, studentDTO.getFullname());
            pstm.setString(2, studentDTO.getEmail());
            pstm.setString(3, studentDTO.getPhoneNumber());
            pstm.setInt(4, studentDTO.getSex());
            pstm.setString(5, studentDTO.getAddress());
            pstm.setString(6, studentDTO.getID());

            return pstm.executeUpdate() > 0;
        }
    }

    // Query delete theo mã số sinh viên => Xoá thông tin sinh viên
    public boolean delete(String maSV) throws Exception {
        String sql = "delete from dbo.SinhVien where MaSV = ?";
        // sử dụng try-with-resources
        try (
                Connection conn = _ConnectionDatabase.openConnection();
                PreparedStatement pstm = conn.prepareStatement(sql);
        ){
            pstm.setString(1, maSV);

            return pstm.executeUpdate() > 0;
        }
    }


    // chức năng in dữ liệu ra từ csdl
    public ArrayList<SinhVienDTO> getData() throws Exception{
        String sql = "select * from dbo.SinhVien";
        try (
                Connection conn = _ConnectionDatabase.openConnection();
                Statement stm = conn.createStatement();
                ) {
            ArrayList<SinhVienDTO> listSinhVien = new ArrayList<SinhVienDTO>();

            ResultSet rs = stm.executeQuery(sql);

            while(rs.next()) {
                SinhVienDTO sinhVienDTO = new SinhVienDTO();
                sinhVienDTO.setID(rs.getString("MaSV").trim());
                sinhVienDTO.setFullname(rs.getString("HoTen").trim());
                sinhVienDTO.setEmail(rs.getString("Email").trim());
                sinhVienDTO.setPhoneNumber(rs.getString("SDT").trim());
                sinhVienDTO.setSex(rs.getInt("GioiTinh"));
                sinhVienDTO.setAddress(rs.getString("DiaChi").trim());

                listSinhVien.add(sinhVienDTO);
            }

            rs.close();
            return listSinhVien;
        }
    }
}
