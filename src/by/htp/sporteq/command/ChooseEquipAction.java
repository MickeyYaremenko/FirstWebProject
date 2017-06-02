package by.htp.sporteq.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.sporteq.dao.EquipDAOImpl;

import static by.htp.sporteq.util.ConstantValue.*;

public class ChooseEquipAction implements CommandAction{
	
	private EquipDAOImpl equipDAO;
	
	public ChooseEquipAction() {
		equipDAO = new EquipDAOImpl();
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

			
		request.setAttribute("map", equipDAO.showEquipByClass(request.getParameter("category")));
		
		return PAGE_EXACT_ORDER;
	}

}
