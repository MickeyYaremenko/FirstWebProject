package by.htp.sporteq.service;

import by.htp.sporteq.dao.UserDAO;
import by.htp.sporteq.dao.UserDAOImpl;
import by.htp.sporteq.entity.User;

public class UserServiceImpl  implements UserService{
	
	private UserDAO userDAO;

	public UserServiceImpl() {
		userDAO = new UserDAOImpl();
	}

	@Override
	public User authorize(String login, String pass) throws NoSuchUserException {
		User user = userDAO.fetchByCredentials(login, pass);
		if(user == null) {
			throw new NoSuchUserException("Invalid credentials");
		}
		return user;
	}

	@Override
	public boolean logOut(User user) {
		return false;
	}

	@Override
	public boolean changePassword(User user, String newPass) {
		userDAO.fetchByCredentials(user.getLogin(), user.getPassword());
		return false;
	}

}
