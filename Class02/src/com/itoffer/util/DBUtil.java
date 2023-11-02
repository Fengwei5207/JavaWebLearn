package com.itoffer.util;

import java.sql.*;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/2 16:29
 */
public class DBUtil {
    static String url = "jdbc:mysql://localhost:3306/itoffer?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC";
    static String username = "root";
    static String password = "12345678";

    //    加载驱动
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    //  创建连接
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }
    //  关闭连接
    public static void closeJDBC(ResultSet rs, Statement st, Connection con){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if (con != null){
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
