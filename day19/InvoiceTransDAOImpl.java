package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import day18.DBUtility;

public class InvoiceTransDAOImpl implements InvoiceTransDAO {
	Connection con;
	Statement s;
	public InvoiceTransDAOImpl() throws SQLException
	{
		con=DBUtility.getConnection();
		s=con.createStatement();
		ResultSet rs=s.executeQuery("create table invoicetrans (invoiceid number ,itemid number ,qty number)");
		
	}
	@Override
	public InvoiceTransDTO findById(Integer invoiceid) throws SQLException {
		PreparedStatement ps =con.prepareStatement("select * from invoicetrans where invoiceid=?");
		ps.setInt(1, invoiceid);
		ResultSet rs=ps.executeQuery();
		return null;
	}
	@Override
	public List<InvoiceTransDTO> findAll() throws SQLException {
		ResultSet rs=s.executeQuery("select * from invoicetrans");
		
		return null;
	}
	@Override
	public void insertInvoicet(InvoiceTransDTO invoicetdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into item value(?,?,?,?)");
		ps.setInt(1, invoicetdto.getInvoiceid());
		ps.setInt(2, invoicetdto.getItemid());
		ps.setInt(3, invoicetdto.getQty());
		ResultSet rs=ps.executeQuery();
	}
	@Override
	public int updateInvoicet(InvoiceTransDTO invoicetdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("update invoicetrans set itemid=?,qty=? where invoiceid=?");
		ps.setInt(3, invoicetdto.getInvoiceid());
		ps.setInt(1, invoicetdto.getItemid());
		ps.setInt(2, invoicetdto.getQty());
		ResultSet rs=ps.executeQuery();
		return 1;
	}
	@Override
	public int deleteByid(Integer invoiceid) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from invoicetrans where invoiceid=?");
		ps.setInt(1, invoiceid);
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	}
