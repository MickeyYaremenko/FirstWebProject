package by.htp.sporteq.command;

import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import static by.htp.sporteq.util.ConstantValue.*;

public class AddItemsAction implements CommandAction {

	@SuppressWarnings("unchecked")
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {

		HttpSession session = request.getSession();
		ArrayList<String> cart;
		if (session.getAttribute("Cart") == null){
			cart = new ArrayList<>();
		} else {
			cart =  (ArrayList<String>) session.getAttribute("Cart");
		}
		
		String[] cartTemp = request.getParameterValues("items");
		Collections.addAll(cart, cartTemp);

		session.setAttribute("Cart", cart);
		String page = PAGE_SHOPPING_CART;
		return page;
	}

}
