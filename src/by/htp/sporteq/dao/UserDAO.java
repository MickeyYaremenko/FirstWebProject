package by.htp.sporteq.dao;

import by.htp.sporteq.entity.User;

public interface UserDAO {
	
	User fetchByCredentials (String login, String pass);
	
	boolean changePassword (String login, String newPass);
	
}
