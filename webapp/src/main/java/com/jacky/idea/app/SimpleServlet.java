package com.jacky.idea.app;

import com.jacky.idea.utils.SimpleService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SimpleServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String protocol = req.getProtocol();

        PrintWriter out = resp.getWriter();
        String desc = SimpleService.getServiceDescription();
        out.println(desc);
        out.flush();
        out.close();
    }
}
