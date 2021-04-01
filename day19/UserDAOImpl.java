package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import day18.DBUtility;

public class UserDAOImpl implements UserDAO{
	Connection con;
	Statement s;
	public UserDAOImpl() throws SQLException
	{
		con=DBUtility.getConnection();
	s=con.createStatement();
	ResultSet rs=s.executeQuery("create table user (userid number, username varchar(30),password varchar(40))");
	
	}
	@Override
	public void getById(Integer userid) throws SQLException {
		PreparedStatement ps =con.prepareStatement("select * from user where userid=?");
		ps.setInt(1, userid);
		ResultSet rs=ps.executeQuery();
		
	}

	@Override
	public List<UserDTO> getAll() throws SQLException {
		ResultSet rs=s.executeQuery("select * from user");
		return null;
	}

	@Override
	public void insert(UserDTO userdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into user value(?,?,?)");
		ps.setInt(1, userdto.getUserid());
		ps.setString(2, userdto.getUsername());
		ps.setString(3,userdto.getPassword());
		ResultSet rs=ps.executeQuery();
	}

	@Override
	public void update(UserDTO userdto) throws SQLException {
	PreparedStatement ps=con.prepareStatement("update user set username=?,password=? where userid=?");
	ps.setInt(3,userdto.getUserid());
	ps.setString(1, userdto.getUsername());
	ps.setString(2, userdto.getPassword());
	ResultSet rs=ps.executeQuery();

		
	}

	@Override
	public int deleteById(Integer userid) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from user where userid=?");
		ps.setInt(1, userid);
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int deleteByUser(UserDTO userdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from cust where custid=?");
		ps.setInt(1, userdto.getUserid());
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
