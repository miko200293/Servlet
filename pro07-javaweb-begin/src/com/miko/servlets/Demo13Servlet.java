package com.miko.servlets;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/demo13")
public class Demo13Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取application保存的作用域数据，key为uname
        ServletContext application =req.getServletContext();
        Object unameObj = application.getAttribute("uname");
        System.out.println("uname="+unameObj);
    }
}
