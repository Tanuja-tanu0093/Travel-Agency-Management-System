package com.travel.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.travel.dto.Booking;
import com.travel.dto.TravelPackage;
import com.travel.dto.User;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {

		try {

			Configuration configuration = new Configuration();

			configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
			configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/travel_agency");
			configuration.setProperty("hibernate.connection.username", "root");
			configuration.setProperty("hibernate.connection.password", "root");

			configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
			configuration.setProperty("hibernate.hbm2ddl.auto", "update");
			configuration.setProperty("hibernate.show_sql", "true");

			configuration.addAnnotatedClass(User.class);
			configuration.addAnnotatedClass(TravelPackage.class);
			configuration.addAnnotatedClass(Booking.class);

			sessionFactory = configuration.buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}