package com.itoffer.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/7 11:18
 */
@WebServlet("/ContextInitParamServlet")
public class ContextInitParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext sc = getServletContext();
        //获取初始化参数
        String name = sc.getInitParameter("name");
        String pwd = sc.getInitParameter("pwd");
        //将参数写入resp
        resp.getWriter().append(name).append("\n").append(pwd).append("\n");

        //获取初始化参数名称,初始化于web.xml
        Enumeration<String> names = sc.getInitParameterNames();
        //遍历名称并将它们附加到resp
        while (names.hasMoreElements()) {
            String str = (String) names.nextElement();
            resp.getWriter().append(str).append("\n");
        }

    }
}