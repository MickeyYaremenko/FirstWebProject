package by.htp.sporteq.dao;

import static by.htp.sporteq.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
//import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import by.htp.sporteq.entity.Equipment;
//import by.htp.sporteq.entity.Report;

public class EquipDAOImpl implements EquipDAO {

	@Override
	public Map<Equipment, Map<String, String>> showEquipByClass(String equipClass) {
		//NEW
		List<Equipment> equipList = new ArrayList<>();
		
		Map<Equipment, Map<String, String>> equipMap = new LinkedHashMap<>();
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

			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SHOW_EQUIP_BY_CLASS);
			ps.setString(1, equipClass);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Equipment equip = new Equipment();
				equip.setEquipID(rs.getInt(1));
				equip.setName(rs.getString(2));
				equip.setPrice(rs.getDouble(3));
				equip.setProperties(getCharacteristics(conn, rs.getInt(1)));
				equipMap.put(equip, getCharacteristics(conn, rs.getInt(1)));
				
				//NEW
				equipList.add(equip);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return equipMap;
	}

	public List<Equipment> showEquipByID(int id){
		List<Equipment> equipList = new ArrayList<>();
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

			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SHOW_EQUIP_BY_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				Equipment equip = new Equipment();
				equip.setEquipID(rs.getInt(1));
				equip.setName(rs.getString(2));
				equip.setPrice(rs.getDouble(3));
				equip.setProperties(getCharacteristics(conn, rs.getInt(1)));
//				equipList.add(equip, getCharacteristics(conn, rs.getInt(1)));
				
				//NEW
				equipList.add(equip);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return equipList;
		
	}
	
	@Override
	public Map<String, String> getCharacteristics(Connection conn, int equipID) throws SQLException {
		Map<String, String> equipCharacteristics = new LinkedHashMap<>();
		PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SHOW_EQUIP_CHARACTERISTICS);
		ps.setInt(1, equipID);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			String firstTempStr = rs.getString(1);
			String secondTempStr = rs.getString(2);
			equipCharacteristics.put(firstTempStr, secondTempStr);
		}
		return equipCharacteristics;
	}

}
