package com.travel.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.travel.dao.UserDAO;
import com.travel.dto.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        try {

            UserDAO userDAO = new UserDAO();
            User user = userDAO.login(email, password);

            if (user != null) {

                HttpSession session = request.getSession();
                session.setAttribute("user", user);

                response.sendRedirect("packages.jsp");

            } else {

                response.getWriter().println("Invalid Email or Password");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}