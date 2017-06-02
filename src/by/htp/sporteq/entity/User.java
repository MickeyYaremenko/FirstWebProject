package by.htp.sporteq.entity;

public class User {

	private int userID;
	private String login;
	private String password;
	private boolean role;

	public User() {
	}

	public User(int id, String login, String password, boolean role) {
		super();
		this.userID = id;
		this.login = login;
		this.password = password;
		this.role = role;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRole() {
		return role;
	}

	public void setRole(boolean role) {
		this.role = role;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (role ? 1231 : 1237);
		result = prime * result + (int) (userID ^ (userID >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role != other.role)
			return false;
		if (userID != other.userID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", login=" + login + ", password=" + password + ", role=" + role + "]";
	}

}
