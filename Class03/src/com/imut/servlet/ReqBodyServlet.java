package com.imut.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author XiaLuo
 * @version 1.0
 * @date 2023/11/9 17:03
 */
@WebServlet("/reqBody")
@MultipartConfig()
public class ReqBodyServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();

        Part part = req.getPart("upLoad");
        String name = part.getSubmittedFileName();
        String path = getServletContext().getRealPath("/");

        System.out.println(path);
        part.write(path+name);

        System.out.println("success!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
