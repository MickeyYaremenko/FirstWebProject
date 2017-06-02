package by.htp.sporteq.util;

public final class ConstantValue {

	private ConstantValue() {
	}

	public static final String ACTION_AUTHORIZE = "login";
	public static final String ACTION_CONFIRM_ORDER = "confirm_order";
	public static final String ACTION_CHOOSE_EQUIP = "choose_equip";
	public static final String ACTION_ADD_ITEMS = "add_items";
	public static final String ACTION_OPEN_USER_ACCOUNT = "open_user_acc";

	public static final String PAGE_ADMIN_MAIN = "/admin.jsp";
	public static final String PAGE_USER_MAIN = "/user.jsp";
	
	public static final String PAGE_ORDER_ALL = "/orders.jsp";
	public static final String PAGE_ORDER_CREATE = "/order.jsp";
	public static final String PAGE_EXACT_ORDER = "/exactOrder.jsp";
	public static final String PAGE_SHOPPING_CART = "/cart.jsp";
	public static final String PAGE_USER_ACÑOUNT = "/user_account.jsp";

	public static final String PAGE_ERROR_MAIN = "/error.jsp";
	public static final String PAGE_DEFAULT = "/index.html";

	public static final String REQUEST_PARAM_ACTION = "";
	public static final String REQUEST_PARAM_AUTHORIZE = "";
	public static final String REQUEST_PARAM_LOGIN = "login";
	public static final String REQUEST_PARAM_PASSWORD = "pass";
	public static final String REQUEST_PARAM_LIST_EQ = "list_eq";
	public static final String REQUEST_PARAM_ERROR_MSG = "error_msg";

	public static final String PARAM_USER_ID = "user_id";
	public static final String PARAM_EQUIP_ID = "equip_id";
	public static final String PARAM_DATE_START = "date_start";
	public static final String PARAM_DATE_END = "date_end";

	public static final String SQL_STATEMENT_SELECT_USERS = "select * FROM user";
	public static final String SQL_STATEMENT_SELECT_USER = "select * FROM user where login = ? and password = ?";
	public static final String SQL_STATEMENT_CHANGE_USER_PASSWORD = "UPDATE user SET password = ? WHERE login = ?";
	public static final String SQL_STATEMENT_ORDER_CREATE = "INSERT INTO sport.order (id_user, date_start, date_end) "
			+ "VALUES (?, ?, ?);";
	public static final String SQL_STATEMENT_EQUIP_TO_ORDER = "INSERT INTO sport.order_equip (id_order, id_equip)"
			+ " VALUES (?, (SELECT id_equip FROM sport.equip WHERE title = ? AND status = 'Available' LIMIT 1))";
	public static final String SQL_STATEMENT_SHOW_FULL_REPORT = "SELECT * FROM sport.order";
	public static final String SQL_STATEMENT_SHOW_USER_REPORT = "SELECT * FROM sport.order "
			+ "JOIN user ON order.userID = user.userID WHERE user.login = ?";
	public static final String SQL_STATEMENT_SHOW_EQUIP_BY_CLASS = "SELECT * FROM sport.equip WHERE class = ?";
	public static final String SQL_STATEMENT_SHOW_EQUIP_BY_ID = "SELECT * FROM sport.equip WHERE id = ?";
	public static final String SQL_STATEMENT_SHOW_EQUIP_CHARACTERISTICS = "SELECT parameters.title, equip_characteristics.value "
			+ "FROM sport.equip_characteristics INNER JOIN sport.parameters ON "
			+ "id_parameters = parameters.id WHERE id_equip = ? ORDER BY parameters.id";

}
