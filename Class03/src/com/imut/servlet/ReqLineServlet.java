package com.imut.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/9 16:19
 */
@WebServlet("/reqLine")
public class ReqLineServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //获取输出流
        PrintWriter out = resp.getWriter();
        String method = req.getMethod();
        String url =  req.getRequestURL().toString();
        String protocol = req.getProtocol();
        String queryString = req.getQueryString();
        String servletPath = req.getServletPath();
        String contextPath = req.getContextPath();

        out.print("Method:"+method+"<br>");
        out.print("URL:"+url+"<br>");
        out.print("Protocol:"+protocol+"<br>");
        out.print("QueryString:"+queryString+"<br>");
        out.print("ServletPath:"+servletPath+"<br>");
        out.print("QueryString:"+queryString+"<br>");
        out.print("ContextPath:"+contextPath+"<br>");

    }
}
