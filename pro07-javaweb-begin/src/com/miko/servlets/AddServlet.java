package com.miko.servlets;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;

public class AddServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //UTF-8中文编码设置
        request.setCharacterEncoding("UTF-8");

        String fname = request.getParameter("fname");
        String priceStr = request.getParameter("price");
        Integer price =Integer.parseInt(priceStr);
        String fcountStr = request.getParameter("fcount");
        Integer fcount=Integer.parseInt(fcountStr);
        String remark = request.getParameter("remark");

        System.out.println("fname="+fname);
        System.out.println("price="+price);
        System.out.println("fcount="+fcount);
        System.out.println("remark="+remark);



    }
}
