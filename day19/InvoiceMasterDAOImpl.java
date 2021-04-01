package day19;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import day18.DBUtility;

public class InvoiceMasterDAOImpl implements InvoiceMasterDAO {
	Connection con;
	Statement s;
	public InvoiceMasterDAOImpl() throws SQLException
	{
		con=DBUtility.getConnection();
		s=con.createStatement();
		ResultSet rs=s.executeQuery("create table invoicemaster (invoiceid number ,invoicedate timestamp, custid number, custphoneno number)");
		
	}
	@Override
	public InvoiceMasterDTO findById(Integer invoiceid) throws SQLException {
		PreparedStatement ps =con.prepareStatement("select * from invoicemaster where invoiceid=?");
		ps.setInt(1, invoiceid);
		ResultSet rs=ps.executeQuery();
		return null;
	}

	@Override
	public List<InvoiceMasterDTO> findAll() throws SQLException {
		ResultSet rs=s.executeQuery("select * from invoicemaster");
		
		return null;
	}

	@Override
	public void insertInvoicem(InvoiceMasterDTO invoicemdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("insert into item value(?,?,?,?)");
		ps.setInt(1, invoicemdto.getInvoiceid());
		ps.setDate(2, (java.sql.Date)invoicemdto.getInvoicedate());
		ps.setInt(3, invoicemdto.getCustid());
		ps.setInt(4, invoicemdto.getCustphoneno());
		ResultSet rs=ps.executeQuery();
	}

	@Override
	public int updateInvoicem(InvoiceMasterDTO invoicemdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("update invoicemaster set invoicedate=?,custid=?,custphoneno=? where invoiceid=?");
		ps.setInt(5, invoicemdto.getInvoiceid());
		ps.setDate(1, invoicemdto.getInvoicedate());
		ps.setInt(2, invoicemdto.getCustid());
		ps.setInt(3, invoicemdto.getCustphoneno());
		ResultSet rs=ps.executeQuery();
		return 1;
	}

	@Override
	public int deleteByid(Integer invoiceid) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from invoicemaster where invoiceid=?");
		ps.setInt(1, invoiceid);
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int deleteByInvoicem(InvoiceMasterDTO invoicemdto) throws SQLException {
		PreparedStatement ps=con.prepareStatement("delete from invoicemaster where invoiceid=?");
		ps.setInt(1, invoicemdto.getInvoiceid());
		if(ps.execute()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
