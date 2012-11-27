package com.skumar.hibernate.main;

import org.hibernate.Session;

import com.skumar.hibernate.domain.Stock;
import com.skumar.hibernate.persistence.HibernateUtil;

public class SimpleXMLMapping {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Stock stock = new Stock();

		stock.setStockCode("47151");
		stock.setStockName("SBI");

		session.save(stock);
		session.getTransaction().commit();
	}
}
