package day19;

import java.io.Serializable;

public class CustDTO implements Serializable,Cloneable {
	private int custid;
	private String custname;
	private String custaddr;
	private int custaccno;
	private int custgstno;

	private static CustDTO custdto;
	
	synchronized public static CustDTO getCustObject()
	{
		if(custdto==null) {
			custdto=new CustDTO();
		}
		return custdto.createClone();
	}
	private CustDTO createClone()
	{
		try
		{
			return (CustDTO)super.clone();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public CustDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustDTO(int custid) {
		super();
		this.custid = custid;
	}
	@Override
	public String toString() {
		return "CustDTO [custid=" + custid + ", custname=" + custname + ", custaddr=" + custaddr + ", custaccno="
				+ custaccno + ", custgstno=" + custgstno + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + custaccno;
		result = prime * result + ((custaddr == null) ? 0 : custaddr.hashCode());
		result = prime * result + custgstno;
		result = prime * result + custid;
		result = prime * result + ((custname == null) ? 0 : custname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustDTO other = (CustDTO) obj;
		if (custaccno != other.custaccno)
			return false;
		if (custaddr == null) {
			if (other.custaddr != null)
				return false;
		} else if (!custaddr.equals(other.custaddr))
			return false;
		if (custgstno != other.custgstno)
			return false;
		if (custid != other.custid)
			return false;
		if (custname == null) {
			if (other.custname != null)
				return false;
		} else if (!custname.equals(other.custname))
			return false;
		return true;
	}
	public final int getCustid() {
		return custid;
	}
	public final String getCustname() {
		return custname;
	}
	public final String getCustaddr() {
		return custaddr;
	}
	public final int getCustaccno() {
		return custaccno;
	}
	public final int getCustgstno() {
		return custgstno;
	}
	public final void setCustid(int custid) {
		this.custid = custid;
	}
	public final void setCustname(String custname) {
		this.custname = custname;
	}
	public final void setCustaddr(String custaddr) {
		this.custaddr = custaddr;
	}
	public final void setCustaccno(int custaccno) {
		this.custaccno = custaccno;
	}
	public final void setCustgstno(int custgstno) {
		this.custgstno = custgstno;
	}
	
}
