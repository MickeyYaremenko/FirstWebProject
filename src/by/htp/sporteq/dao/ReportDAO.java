package by.htp.sporteq.dao;

import java.util.List;

import by.htp.sporteq.entity.Report;
import by.htp.sporteq.entity.User;

public interface ReportDAO {

	List<Report> showAllOrders();
	List<Report> showUserOrders(User user);
}
