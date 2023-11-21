package com.test.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/16 16:25
 */

@WebServlet("/shoppingCar")
public class ShoppingCarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setCharacterEncoding("UTF-8");
       resp.setContentType("text/html;charset=UTF-8");

        //获取前端传递的值
        String[] books = req.getParameterValues("books");
        //已经有Session存在
        HttpSession session = req.getSession();
        //书名为key, 数量为value
        Map<String, Integer> car = (Map<String, Integer>) session.getAttribute("bookList");
        if (car == null){
            car = new HashMap<String, Integer>();
        }
        for(String book:books){
            if (car.containsKey(book)){
                int count = car.get(book)+1;
                car.put(book, count);
            }else{
                car.put(book, 1);
            }
        }
        session.setAttribute("bookList", car);
        resp.sendRedirect("/shoppingList");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
