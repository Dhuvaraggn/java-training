package day19;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
	public void getById(Integer userid) throws SQLException;
	public List<UserDTO> getAll()throws SQLException;
	public void insert(UserDTO userdto)throws SQLException;
	public void update(UserDTO userdto)throws SQLException;
	public int deleteById(Integer userid)throws SQLException;
	public int deleteByUser(UserDTO userdto)throws SQLException;
}
