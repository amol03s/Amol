package com.training.service;

import com.training.Dao.AutherDao;
import com.training.Dao.AutherDaoImpl;
import com.training.beans.Auther;

public class AutherserviceImpl implements Autherservice {

	
	    private AutherDao adao;
	    
	

	public AutherserviceImpl() {
			super();
			this.adao = new AutherDaoImpl();
		}



	@Override
	public boolean addAuther(Auther a) {
		
		return adao.addAuther(a);
	}

}
