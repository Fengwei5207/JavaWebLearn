package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/10/27 15:23
 */
@WebServlet("/formReqServlet")
public class FormReqServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String[] source = req.getParameterValues("source");
        StringBuffer strb = new StringBuffer();
        System.out.println(username + ":" + password);
        for (String str:source
             ) {
            System.out.println(str);
            strb.append(str + ",");
        }
        resp.getWriter().write("<h1>登录成功</h1>");
        resp.getWriter().write("<h1>用户名：" + username + "</h1>");
        resp.getWriter().write("<h1>密码：" + password + "</h1>");
        resp.getWriter().write("<h1>来源：" + strb.toString() + "</h1>");

    }
}
