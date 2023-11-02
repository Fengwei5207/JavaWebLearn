package com.itoffer.dao;

import com.itoffer.util.DBUtil;

import java.sql.*;
import java.util.Date;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/2 16:29
 */
public class ApplicationDao {
    //验证邮箱是否被注册
    public boolean isExistEmail(String email) {
        Connection con = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "select * from tb_applicant where applicant_email = ?";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeJDBC(rs, pstmt, con);
        }
        return false;
    }

    public void save(String email, String password){
        Connection con = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "insert into tb_applicant(APPLICANT_EMAIL, APPLICANT_PWD, APPLICANT_REGISTDATE) values(?,?,?)";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            pstmt.setTimestamp(3,new Timestamp(new Date().getTime()));
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
