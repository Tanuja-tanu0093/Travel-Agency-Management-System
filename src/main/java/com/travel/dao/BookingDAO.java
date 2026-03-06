package com.travel.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.travel.dto.Booking;
import com.travel.util.HibernateUtil;

public class BookingDAO {

    public void bookPackage(int userId, int packageId) {

        Session session = null;
        Transaction transaction = null;

        try {

            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Booking booking = new Booking();
            booking.setUserId(userId);
            booking.setPackageId(packageId);
            booking.setStatus("BOOKED");

            // Updated method
            session.persist(booking);

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

        } finally {

            if (session != null) {
                session.close();
            }
        }
    }


    public void cancelBooking(int bookingId) {

        Session session = null;
        Transaction transaction = null;

        try {

            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            Booking booking = session.get(Booking.class, bookingId);

            if (booking != null) {

                booking.setStatus("CANCELLED");

                // update booking status
                session.merge(booking);

            }

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();

        } finally {

            if (session != null) {
                session.close();
            }
        }
    }
}