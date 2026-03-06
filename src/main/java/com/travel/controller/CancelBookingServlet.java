package com.travel.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.travel.dao.BookingDAO;

@WebServlet("/cancel")
public class CancelBookingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        try {

            int bookingId = Integer.parseInt(request.getParameter("id"));

            BookingDAO dao = new BookingDAO();
            dao.cancelBooking(bookingId);

            response.sendRedirect("bookingHistory.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}