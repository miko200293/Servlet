package com.miko.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/demo8")

public class Demo08Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //向request保存作用域保存数据
            //req.setAttribute("uname","lili");
            //resp.sendRedirect("demo9");


        //内请求
        req.getRequestDispatcher("demo9").forward(req,resp);
    }
}
