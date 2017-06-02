package by.htp.sporteq.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import com.mysql.cj.api.jdbc.Statement;

import by.htp.sporteq.entity.Order;
//import by.htp.sporteq.entity.User;
import static by.htp.sporteq.util.ConstantValue.*;

public class OrderDAOImpl implements OrderDAO {

	@Override
	public boolean createOrder(Order order) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");

		try {
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);

			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_ORDER_CREATE, Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, order.getUser().getUserID());
			ps.setDate(2, order.getDateStart());
			ps.setDate(3, order.getDateEnd());
			ps.executeUpdate();

			ResultSet keys = ps.getGeneratedKeys();
			int orderID = 0;

			if (keys.next()) {
				orderID = keys.getInt(1);
				PreparedStatement ps2 = conn.prepareStatement(SQL_STATEMENT_EQUIP_TO_ORDER);
				for (int i = 0; i < order.getEquipTitles().size(); i++) {
					String current = order.getEquipTitles().get(i);
					ps2.clearParameters();
					ps2.setInt(1, orderID);
					ps2.setString(2, current);
					ps2.execute();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<Order> fetchAll() {
		return null;
	}

}
