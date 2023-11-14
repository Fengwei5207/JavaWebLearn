package com.test.servlet.netInfo;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/10 14:22
 */

@WebServlet("/netInfo")
public class NetInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        String ra = req.getRemoteAddr();
        String remoteHost = req.getRemoteHost();
        String localAddr = req.getLocalAddr();
        String localName = req.getLocalName();
        int localPort = req.getLocalPort();
        String serverName = req.getServerName();
        int serverPort = req.getServerPort();
        String scheme = req.getScheme();
        String protocol = req.getProtocol();
        String url = req.getRequestURI();
        System.out.println("IP地址：" + ra + " 远程主机名：" + remoteHost + " 本地IP地址：" + localAddr + " 本地主机名：" + localName + " 本地端口：" + localPort + " 服务器名：" + serverName + " 服务器端口：" + serverPort + " 协议：" + scheme + " 协议版本：" + protocol + " 请求URL：" + url);


        Date date = new Date();
        SimpleDateFormat time = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String a = time.format(date);
        resp.getWriter().print(a);
        resp.setIntHeader("refresh", 1);

        String path = getServletContext().getRealPath("/img/a.jpg");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        ServletOutputStream ops = resp.getOutputStream();

        byte[] by = new byte[1024];
        while (bis.read(by) != -1){
            ops.write(by);
        }
        bis.close();
        ops.close();

    }
}
