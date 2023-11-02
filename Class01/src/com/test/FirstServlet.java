package com.test;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/10/26 17:24
 */
@WebServlet(urlPatterns = "/first", name = "firstServlet", loadOnStartup = 1)
/*
    @WebServlet 注解
    urlPatterns = "/first" URL匹配模式,可匹配地址映射 路径匹配 拓展名匹配, 也可为字符串数组["/first","/XX"]
    name = "firstServlet" servlet名
    loadOnStartup = 1 启动servlet优先级

    也可使用web.xml方式配置,且3.0版本以下只支持此方法配置
    <servlet>
        <servlet-name>FirstServlet</servlet-name>
        <servlet-class>com.test.FirstServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>FirstServlet</servlet-name>
        <url-pattern>/first</url-pattern>
    </servlet-mapping>
 */

public class FirstServlet extends HttpServlet {
    public FirstServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }

    @Override
    protected long getLastModified(HttpServletRequest req) {
        return super.getLastModified(req);
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doHead(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doOptions(req, resp);
    }

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doTrace(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//        resp.getWriter().append("Served at: ").append(req.getRequestURL());



        //中文乱码
        resp.setContentType("text/html; charset=UTf-8");
        req.setCharacterEncoding("UTF-8");;
        String name = req.getParameter("name");
        System.out.println(name);

        resp.getWriter().append("Hello " + name + "!");

    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public String getInitParameter(String name) {
        return super.getInitParameter(name);
    }

    @Override
    public Enumeration<String> getInitParameterNames() {
        return super.getInitParameterNames();
    }

    @Override
    public ServletConfig getServletConfig() {
        return super.getServletConfig();
    }

    @Override
    public ServletContext getServletContext() {
        return super.getServletContext();
    }

    @Override
    public String getServletInfo() {
        return super.getServletInfo();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void log(String message) {
        super.log(message);
    }

    @Override
    public void log(String message, Throwable t) {
        super.log(message, t);
    }

    @Override
    public String getServletName() {
        return super.getServletName();
    }
}
