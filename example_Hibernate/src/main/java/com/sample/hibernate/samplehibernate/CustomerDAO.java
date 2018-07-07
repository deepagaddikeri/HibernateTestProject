package com.sample.hibernate.samplehibernate;



import org.hibernate.Session;
import org.hibernate.Transaction;



public class CustomerDAO implements ICustomer  {

	@Override
	public void addCustomer(Customer custObject1) {
		Session session= null;
		try {
		 session=HibernateUtill.getSessionFactory().openSession();
		 Transaction tx= session.beginTransaction();
		 session.save(custObject1);
		 
			tx.commit();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		if(session != null)	
		 session.close();
		}
		// TODO Auto-generated method stub
		
	}
	

}
