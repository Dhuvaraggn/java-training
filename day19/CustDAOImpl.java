package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import day18.DBUtility;

public class CustDAOImpl implements CustDAO{
	Connection con;
	Statement s;
	public CustDAOImpl() throws SQLException
	{
		con=DBUtility.getConnection();
		s=con.createStatement();
		ResultSet rs=s.executeQuery("create table cust ( custid number, custname varchar(30),custaddr varchar(40),custaccno number,custgstno number)");
	}	
	@Override
	public CustDTO findById(Integer custid) throws SQLException {
		PreparedStatement ps =con.prepareStatement("select * from cust where custid=?");
		ps.setInt(1, custid);
		ResultSet rs=ps.executeQuery();
		
		return null;
	}

	@Override
	public List<CustDTO> findAll() throws SQLException {
		ResultSet rs=s.executeQuery("select * from cust");
		return null;
	}

	@Override
	public void insertCust(CustDTO custdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into cust value(?,?,?,?,?)");
		ps.setInt(1, custdto.getCustid());
		ps.setString(2, custdto.getCustname());
		ps.setString(3,custdto.getCustaddr());
		ps.setInt(4, custdto.getCustaccno());
		ps.setInt(5, custdto.getCustgstno());
		ResultSet rs=ps.executeQuery();
	}

	@Override
	public int updateCust(CustDTO custdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("update cust set custid=?,custaddr=?,custaccno=?,custgstno=? where custid=?");
		ps.setInt(5,custdto.getCustid());
		ps.setString(1, custdto.getCustname());
		ps.setString(2, custdto.getCustaddr());
		ps.setInt(3, custdto.getCustaccno());
		ps.setInt(4, custdto.getCustgstno());
		ResultSet rs=ps.executeQuery();
		return 1;
	}

	@Override
	public int deleteByid(Integer custid) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete  from cust where custid=?");
		ps.setInt(1, custid);
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int deleteBycust(CustDTO custdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete  from cust where custid=?");
		ps.setInt(1, custdto.getCustid());
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
