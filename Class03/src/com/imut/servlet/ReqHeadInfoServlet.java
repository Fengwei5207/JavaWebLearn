package com.imut.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Locale;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/9 16:42
 */

@WebServlet("/reqHeadInfo")
public class ReqHeadInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求头信息
        PrintWriter out = resp.getWriter();
        String ct = req.getHeader("Content-Type");
        Enumeration<String> names = req.getHeaderNames();
        Enumeration<String> values = req.getHeaders("Accept-Encoding");
        int len = req.getContentLength();
        String type = req.getContentType();
        Locale lc = req.getLocale();
        //输出上述变量在网页

    }
}
