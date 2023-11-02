package com.itoffer.dao;

import com.itoffer.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            } else {
                return false;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBUtil.closeJDBC(rs, pstmt, con);
        }
    }

}
