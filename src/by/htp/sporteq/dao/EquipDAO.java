package by.htp.sporteq.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import by.htp.sporteq.entity.Equipment;

public interface EquipDAO {
	Map<Equipment, Map<String, String>> showEquipByClass(String equipClass);
	List<Equipment> showEquipByID(int id);
	Map<String, String> getCharacteristics(Connection conn, int equipID) throws SQLException;
}
