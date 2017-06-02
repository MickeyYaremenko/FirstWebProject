package by.htp.sporteq.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.sporteq.entity.Equipment;
import by.htp.sporteq.entity.Report;
import by.htp.sporteq.entity.User;
import by.htp.sporteq.service.OrderService;
import by.htp.sporteq.service.OrderServiceImpl;
import by.htp.sporteq.service.ReportService;
import by.htp.sporteq.service.ReportServiceImpl;

import static by.htp.sporteq.util.ConstantValue.*;

import java.sql.Date;
import java.util.List;

public class ConfirmOrderAction implements CommandAction {

	private OrderService orderService;
	private ReportService reportService;

	public ConfirmOrderAction() {
		orderService = new OrderServiceImpl();
		reportService = new ReportServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String page = "";
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		@SuppressWarnings("unchecked")
		List<String> equipTitles = (List<String>) session.getAttribute("Cart");
		
		if (equipTitles != null && equipTitles.size() != 0){
			String dateStart = request.getParameter(PARAM_DATE_START);
			String dateEnd = request.getParameter(PARAM_DATE_END);
			Date start = Date.valueOf(dateStart);
			Date end = Date.valueOf(dateEnd);
			orderService.makeOrder(user, equipTitles, start, end);
			
			page = PAGE_USER_MAIN;
			return page;
		} else {
			page = PAGE_ERROR_MAIN;
			return page;
		}
		
//		 String page = PAGE_ORDER_ALL;
//		String page = PAGE_ORDER_ALL;
//
////		String userID = request.getParameter(PARAM_USER_ID);
//		String equipID = request.getParameter(PARAM_EQUIP_ID);
//		
//
////		user.setUserID(Long.valueOf(userID));
//		Equipment equip = new Equipment();
//		equip.setEquipID(Long.valueOf(equipID));
//		
//		List<Report> list = reportService.showReport();
//
//		request.setAttribute("list_report", list);

	}

}
