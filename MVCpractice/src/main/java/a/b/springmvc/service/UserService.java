package a.b.springmvc.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import a.b.springmvc.dao.UserDao;
import a.b.springmvc.model.Login;
import a.b.springmvc.model.User;

public class UserService implements UserDao {

	@Autowired
	DataSource
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return null;
	}

}
