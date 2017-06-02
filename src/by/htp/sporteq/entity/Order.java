package by.htp.sporteq.entity;

import java.sql.Date;
import java.util.List;

public class Order {

	private Long orderId;
	private User user;
	private List<String> equipTitles;
	private Date dateStart;
	private Date dateEnd;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Long orderId, User user, List<String> equipTitles, Date dateStart, Date dateEnd) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.equipTitles = equipTitles;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<String> getEquipTitles() {
		return equipTitles;
	}

	public void setEquipTitles(List<String> equipTitles) {
		this.equipTitles = equipTitles;
	}

	public Date getDateStart() {
		return dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}

	public Date getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEnd == null) ? 0 : dateEnd.hashCode());
		result = prime * result + ((dateStart == null) ? 0 : dateStart.hashCode());
		result = prime * result + ((equipTitles == null) ? 0 : equipTitles.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Order other = (Order) obj;
		if (dateEnd == null) {
			if (other.dateEnd != null)
				return false;
		} else if (!dateEnd.equals(other.dateEnd))
			return false;
		if (dateStart == null) {
			if (other.dateStart != null)
				return false;
		} else if (!dateStart.equals(other.dateStart))
			return false;
		if (equipTitles == null) {
			if (other.equipTitles != null)
				return false;
		} else if (!equipTitles.equals(other.equipTitles))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", equipTitles=" + equipTitles + ", dateStart="
				+ dateStart + ", dateEnd=" + dateEnd + "]";
	}

}
