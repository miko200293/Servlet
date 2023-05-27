package com.miko.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
//application保存作用域
@WebServlet(value = "/demo12")
public class Demo12Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向application保存作用域保存数据
        //servletcontext:servlet的上下文
        ServletContext application =req.getServletContext();
        application.setAttribute("uname","oliver");
        resp.sendRedirect("demo13");
        //req.getRequestDispatcher("demo11").forward(req,resp);
    }
}
