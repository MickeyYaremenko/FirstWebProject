package by.htp.sporteq.service;

import java.sql.Date;

import by.htp.sporteq.dao.OrderDAO;
import by.htp.sporteq.dao.OrderDAOImpl;
import by.htp.sporteq.entity.Equipment;
import by.htp.sporteq.entity.Order;
import by.htp.sporteq.entity.User;

public class OrderServiceImpl implements OrderService {

	private OrderDAO orderDAO;

	public OrderServiceImpl() {
		orderDAO = new OrderDAOImpl();
	}

	@Override
	public Order makeOrder(User user, Equipment equip, Date start, Date end) {
		Order order = new Order();
		order.setUser(user);
		order.setEquipment(equip);
		order.setDateStart(start);
		order.setDateEnd(end);

		orderDAO.createOrder(order);

		return null;
	}

}
