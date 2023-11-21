package com.test.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/16 16:26
 */
@WebServlet("/shoppingList")
public class ShoppingListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession();
        Map<String, Integer> car = (Map<String, Integer>) session.getAttribute("bookList");
        for (String name:car.keySet()) {
            out.print(name+":"+car.get(name)+"\n");
        }
    }
}
