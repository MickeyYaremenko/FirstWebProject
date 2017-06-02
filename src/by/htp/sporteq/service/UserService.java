package by.htp.sporteq.service;

import by.htp.sporteq.entity.User;

public interface UserService {
	
	User authorize(String login, String passwrod) throws NoSuchUserException;
	boolean logOut(User user);
	boolean changePassword(User user, String newPass);

}
