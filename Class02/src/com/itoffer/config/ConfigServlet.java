package com.itoffer.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/7 10:37
 */
@WebServlet(value = "/ConfigServlet",
            initParams = {//初始化参数
                            @WebInitParam(name = "user", value = "zs"),
                            @WebInitParam(name = "pwd", value = "123456")
                        })
public class ConfigServlet extends HttpServlet {


    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletConfig对象
        ServletConfig config = getServletConfig();
        //获取初始化参数
        String user = config.getInitParameter("user");
        String pwd = config.getInitParameter("pwd");
        //获取初始化参数
        //获取初始化参数的名称
        Enumeration<String> names = config.getInitParameterNames();
        StringBuffer sb = new StringBuffer();
        while(names.hasMoreElements()){
            String string = (String) names.nextElement();
            sb.append(string);
            sb.append("<br /> ");
        }
        //将用户名和密码写入响应
        resp.getWriter().append(user).append("\n").append(pwd).append("<br />").append(sb.toString());

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }
}
