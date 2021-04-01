package day19;
import day18.DBUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {
	private Connection con;
	private Statement s;
	public ItemDAOImpl() throws SQLException
	{
		con=DBUtility.getConnection();
		s=con.createStatement();
		ResultSet rs=s.executeQuery("create table item (itemid number,itemdesc varchar(30),unit number,price number,flag boolean)");
	}
	@Override
	public ItemDTO findbyId(Integer itemid) throws SQLException {
		PreparedStatement ps =con.prepareStatement("select * from item where itemid=?");
		ps.setInt(1, itemid);
		ResultSet rs=ps.executeQuery();
		return null;
	}

	@Override
	public List<ItemDTO> findAll() throws SQLException {
		ResultSet rs=s.executeQuery("select * from item");
		
		return null;
	}

	@Override
	public void insertItem(ItemDTO itemdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into item value(?,?,?,?,?)");
		ps.setInt(1, itemdto.getItemid());
		ps.setString(2, itemdto.getItemdesc());
		ps.setInt(3, itemdto.getUnit());
		ps.setInt(4, itemdto.getPrice());
		ps.setBoolean(5, itemdto.isFlag());
		ResultSet rs=ps.executeQuery();
	}

	@Override
	public void updateItem(ItemDTO itemdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("update item set itemdesc=?,unit=?,price=?,flag=? where itemid=?");
		ps.setInt(5, itemdto.getItemid());
		ps.setString(1, itemdto.getItemdesc());
		ps.setInt(2, itemdto.getUnit());
		ps.setInt(3, itemdto.getPrice());
		ps.setBoolean(4, itemdto.isFlag());
		ResultSet rs=ps.executeQuery();
	}

	@Override
	public int deleteItembyid(Integer itemid) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from item where itemid=?");
		ps.setInt(1, itemid);
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int deleteItembydto(ItemDTO itemdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from item where itemid=?");
		ps.setInt(1, itemdto.getItemid());
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
