package com.learner.service.implementation;

import com.learner.dao.ClassesDAO;
import com.learner.dao.LoginDAO;
import com.learner.dao.implementation.ClassesDaoImplementation;
import com.learner.dao.implementation.LoginDaoImplementation;
import com.learner.model.Login;
import com.learner.service.LoginService;

public class LoginServiceImplementation  implements LoginService{
	
	private LoginDAO dao = new LoginDaoImplementation();

	@Override
	public Login validateLogin(Login login) {
		return	dao.validateLogin(login);
		
	}
}
