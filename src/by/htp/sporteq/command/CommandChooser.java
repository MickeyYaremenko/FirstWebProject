package by.htp.sporteq.command;
import static by.htp.sporteq.util.ConstantValue.*;

public class CommandChooser {
	public static CommandAction chooseAction(String action){
		switch (action) {
		case ACTION_AUTHORIZE:
			System.out.println("Login action " + action);
			return new LoginCommandAction();
		case ACTION_CONFIRM_ORDER:
			System.out.println("Create order action ");
			return new ConfirmOrderAction();
		case ACTION_CHOOSE_EQUIP:
			System.out.println("Choose equip action " + action);
			return new ChooseEquipAction();
		case ACTION_ADD_ITEMS:
			System.out.println("Add items to a cart action " + action);
			return new AddItemsAction();
		case ACTION_OPEN_USER_ACCOUNT:
			System.out.println("Open user account " + action);
			return new UserAccountAction();
		}
		
		//STUB !!!
		return null;
	}
}
