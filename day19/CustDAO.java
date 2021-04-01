package day19;

import java.sql.SQLException;
import java.util.List;

public interface CustDAO {
	public CustDTO findById(Integer custid)throws SQLException;
	public List<CustDTO> findAll()throws SQLException;
	public void insertCust(CustDTO custdto)throws SQLException;
	public int updateCust(CustDTO custdto)throws SQLException;
	public int deleteByid(Integer custid)throws SQLException;
	public int deleteBycust(CustDTO custdto)throws SQLException;
}
