package day19;

import java.sql.SQLException;
import java.util.List;

public interface ItemDAO {
	public ItemDTO findbyId(Integer itemid) throws SQLException;
	public List<ItemDTO> findAll()throws SQLException;
	public void insertItem(ItemDTO itemdto)throws SQLException;
	public void updateItem(ItemDTO itemdto)throws SQLException;
	public int deleteItembyid(Integer itemid)throws SQLException;
	public int deleteItembydto(ItemDTO itemdto) throws SQLException;
}
