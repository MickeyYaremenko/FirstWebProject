package by.htp.sporteq.entity;

import java.sql.Date;
//import java.util.ArrayList;
import java.util.List;

public class Report {

	private int orderID;
	private int userID;
	private List<Equipment> equipList;
	private Date dateStart;
	private Date dateEnd;
	private double sum;

	public Report() {
		super();
	}

	public Report(int orderID, int userID, List<Equipment> equipIDList, Date dateStart, Date dateEnd) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.equipList = equipIDList;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public List<Equipment> getEquipList() {
		return equipList;
	}

	public void setEquipList(List<Equipment> equipIDList) {
		this.equipList = equipIDList;
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

	public void addEquip(Equipment equip) {
		equipList.add(equip);
	}

}
