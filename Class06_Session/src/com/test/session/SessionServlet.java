package com.test.session;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/16 16:07
 */

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp) throws javax.servlet.ServletException, java.io.IOException {
        System.out.println("SessionServlet doGet");

    }
}
