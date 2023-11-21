package com.test.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/14 11:02
 */
@WebServlet("/cookie")
/*
 * Cookie分为临时Cookie(会话Cookie)和持久化Cookie
 * cookie.setMaxAge()设置其存活时间
 *
 *
 */
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        //访问时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String date = sdf.format(new Date());
        //访问时间级及次数的变量
        String lastTime = "";
        int count = 0;
        //输出流
        PrintWriter pw = resp.getWriter();

        //创建cookie
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                //获取cookie的值
                if ("lastTime" == cookie.getName()) {
//                    pw.print(cookie.getValue());
                    date = cookie.getValue();
                }
                if ("count" == cookie.getName()) {
//                    pw.print(Integer.valueOf(cookie.getValue()) + 1);
                    count = Integer.valueOf(cookie.getValue());
                }
            }
        }
        if (lastTime == "" || lastTime == null) {
            pw.print(date);
            pw.print(count + 1);
        }
        count += 1;
        Cookie ck1 = new Cookie("lastTime", date);
        Cookie ck2 = new Cookie("count", String.valueOf(count+1));
//        System.out.println(ck1.toString()+ck2.toString());
        resp.addCookie(ck1);
        resp.addCookie(ck2);
//        System.out.println("hahahas");

    }

}
