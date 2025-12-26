package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//@WebServlet("/my-servlet")              //it's a path /my-servlet  if you see web.xml you will found the code this annotation is alternate of those 
public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter printWriter=res.getWriter();
        printWriter.print("Response from doGet()\n\t Hello I'm Swapan S");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter printWriter=res.getWriter();
        printWriter.print("Response from doPost()\n\t Hello I'm Swapan S");
    }
}
