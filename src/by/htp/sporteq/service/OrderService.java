package by.htp.sporteq.service;

import java.sql.Date;
import java.util.List;

import by.htp.sporteq.entity.Order;
import by.htp.sporteq.entity.User;

public interface OrderService {
	
	Order makeOrder(User UserID, List<String> equipTitles, Date start, Date end);

}
