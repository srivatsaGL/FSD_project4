package com.learner.dao.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.learner.dao.LoginDAO;
import com.learner.model.Classes;
import com.learner.model.Login;
import com.learner.model.Registration;

public class LoginDaoImplementation implements LoginDAO{
	
	private static SessionUtil sessionUtil = SessionUtil.getInstance();

	@Override
	public Login validateLogin(Login login) {
		 String message= "Either username or password is incorrect";
		Session session = sessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		List<Registration> registrationList = session.createQuery("from com.learner.model.Registration").list();
		transaction.commit();
		session.close();
		for(Registration r : registrationList){
			if((r.getUsername()).equals(login.getUsername())){
				
				if((r.getPassword()).equals(login.getPassword())){
					
//					if(r.getIs_admin().equalsIgnoreCase("true"))
//					{
//						login.setIs_admin(r.getIs_admin());
//					//message="Login Successfull....Welcome Admin";
//					}
					login.setIs_admin(r.getIs_admin());
					return login;
				//	else
					//return login;//message = "Login is successfull";
				}
				return null;//message;
			}
		}
		return null;//message;
	}

}