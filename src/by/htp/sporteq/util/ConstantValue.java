package by.htp.sporteq.util;

public final class ConstantValue {

	private ConstantValue() {
	}
	
	public static final String ACTION_AUTHORIZE = "login";
	public static final String ACTION_MAKE_ORDER = "create_order";
	public static final String ACTION_ORDER = "make_order";
	
	
	public static final String PAGE_ADMIN_MAIN = "/admin.jsp";
	public static final String PAGE_USER_MAIN = "/user.jsp";
	
	public static final String PAGE_ORDER_ALL = "/orders.jsp";
	public static final String PAGE_ORDER_CREATE = "/order.jsp";
	
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

	public static final String SQL_STATEMENT_SELECT_USERS = "select * from user";
	public static final String SQL_STATEMENT_SELECT_USER = "select * from user where login = ? and password = ?";
	public static final String SQL_STATEMENT_ORDER_CREATE = "INSERT INTO sport.order (id_user, id_equip, date_start, date_end) "
			+ "VALUES (?, ?, ?, ?);";
	public static final String SQL_STATEMENT_SHOW_REPORT = "SELECT * from sport.order";

}
