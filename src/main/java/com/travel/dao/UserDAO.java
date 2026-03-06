package com.travel.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.travel.dto.User;
import com.travel.util.HibernateUtil;

public class UserDAO {

    public User login(String email, String password) {

        Session session = null;
        User user = null;

        try {

            session = HibernateUtil.getSessionFactory().openSession();

            String hql = "FROM User WHERE email = :email AND password = :password";

            Query<User> query = session.createQuery(hql, User.class);
            query.setParameter("email", email);
            query.setParameter("password", password);

            user = query.uniqueResult();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (session != null) {
                session.close();
            }
        }

        return user;
    }
}