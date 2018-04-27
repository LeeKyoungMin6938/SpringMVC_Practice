package a.b.springmvc.dao;

import a.b.springmvc.model.Login;
import a.b.springmvc.model.User;

public interface UserDao {
	void register(User user);
	User validateUser(Login login);
}
