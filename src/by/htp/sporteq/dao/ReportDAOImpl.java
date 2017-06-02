package by.htp.sporteq.dao;

import static by.htp.sporteq.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.sporteq.entity.Equipment;
import by.htp.sporteq.entity.Report;
import by.htp.sporteq.entity.User;

public class ReportDAOImpl implements ReportDAO {

	private EquipDAOImpl equipDAO;

	public ReportDAOImpl() {
		super();
		this.equipDAO = new EquipDAOImpl();
	}

	@Override
	public List<Report> showAllOrders() {
		List<Report> list = new ArrayList<>();
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");

		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*
			 * Statement st = conn.createStatement(); ResultSet rs =
			 * st.executeQuery(SQL_STATEMENT_SELECT_USER);
			 */

			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SHOW_FULL_REPORT);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Report someReport = new Report();
				someReport.setOrderID(rs.getInt(1));
				someReport.setUserID(rs.getInt(2));
				List<Equipment> equipList = equipDAO.showEquipByID(rs.getInt(3));
				someReport.setEquipList(equipList);
				someReport.setDateStart(rs.getDate(4));
				someReport.setDateEnd(rs.getDate(5));

				list.add(someReport);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List<Report> showUserOrders(User user) {
		List<Report> list = new ArrayList<>();
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");

		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*
			 * Statement st = conn.createStatement(); ResultSet rs =
			 * st.executeQuery(SQL_STATEMENT_SELECT_USER);
			 */

			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SHOW_USER_REPORT);
			ps.setString(1, user.getLogin());
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Report someReport = new Report();
				someReport.setOrderID(rs.getInt(1));
				someReport.setUserID(rs.getInt(2));
				List<Equipment> equipList = equipDAO.showEquipByID(rs.getInt(3));
				someReport.setEquipList(equipList);
				someReport.setDateStart(rs.getDate(4));
				someReport.setDateEnd(rs.getDate(5));

				list.add(someReport);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;

	}

}
