package com.controller;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "LoginController")
public class LoginController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");
        System.out.println(uname+":"+pass);
    }

}
